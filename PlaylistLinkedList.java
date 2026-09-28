public class PlaylistLinkedList {
    Node head;
    Node tail;

    public void add(String judulLagu, String penyanyi) {
        Node newNode = new Node(judulLagu, penyanyi);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode; 
        }
        System.out.println("The song \"" + judulLagu + "\" has been added successfully.");
    }

    public void delete(String judulLagu) {
        if (head == null) {
            System.out.println("Playlist is empty, no song to delete.");
            return;
        }

        if (head.judulLagu.equalsIgnoreCase(judulLagu)) {
            System.out.println("The song \"" + head.judulLagu + "\" has been deleted successfully.");
            head = head.next;
            if (head == null) { 
                tail = null;
            }
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.judulLagu.equalsIgnoreCase(judulLagu)) {
            current = current.next;
        }

        if (current.next != null) {
            System.out.println("The song \"" + current.next.judulLagu + "\" has been deleted successfully.");
            if (current.next == tail) { 
                tail = current;
            }
            current.next = current.next.next;
        } else {
            System.out.println("The song \"" + judulLagu + "\" was not found.");
        }
    }

    public void search(String judulLagu) {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        Node current = head;
        int posisi = 1;
        while (current != null) {
            if (current.judulLagu.equalsIgnoreCase(judulLagu)) {
                System.out.println("The song \"" + judulLagu + "\" was found at position " + posisi + " (Artist: " + current.penyanyi + ").");
                return;
            }
            current = current.next;
            posisi++;
        }
        System.out.println("The song \"" + judulLagu + "\" was not found in the playlist.");
    }

    public void check() {
        if (head == null) {
            System.out.println("Playlist is currently empty.");
            return;
        }

        System.out.println("\n================ PLAYLIST LIST ================");
        Node current = head;
        int no = 1;
        while (current != null) {
            System.out.println(no + ". " + current.judulLagu + " - " + current.penyanyi);
            current = current.next;
            no++;
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Head: " + head.judulLagu + " | Tail: " + tail.judulLagu);
        System.out.println("=================================================");
    }
}