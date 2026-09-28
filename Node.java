public class Node {
    String judulLagu;
    String penyanyi;
    Node next;

    public Node(String judulLagu, String penyanyi) {
        this.judulLagu = judulLagu;
        this.penyanyi = penyanyi;
        this.next = null;
    }
}