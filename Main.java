import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlaylistLinkedList playlist = new PlaylistLinkedList();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== WLCOME TO SONG PLAYLIST MENU! ===");
            System.out.println("1. Add song");
            System.out.println("2. Delete song");
            System.out.println("3. Search song");
            System.out.println("4. Check (show all songs)");
            System.out.println("5. Exit");
            System.out.print("select menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    System.out.print("Input song title: ");
                    String judul = scanner.nextLine();
                    System.out.print("Input artist name: ");
                    String penyanyi = scanner.nextLine();
                    playlist.add(judul, penyanyi);
                    break;
                case 2:
                    System.out.print("Input song title to delete: ");
                    String hapusJudul = scanner.nextLine();
                    playlist.delete(hapusJudul);
                    break;
                case 3:
                    System.out.print("Input song title to search: ");
                    String cariJudul = scanner.nextLine();
                    playlist.search(cariJudul);
                    break;
                case 4:
                    playlist.check();
                    break;
                case 5:
                    System.out.println("Program is exiting.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (pilihan != 5);

        scanner.close();
    }
}