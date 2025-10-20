import java.util.ArrayList;
import java.util.Scanner;

public class NoteTakingApp {
    private static ArrayList<String> notes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.println("Note-Taking Application");
            System.out.println("1. Add Note");
            System.out.println("2. Show All Notes");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            input = scanner.nextLine();
            
            if (input.equals("1")) {
                System.out.print("Enter your note: ");
                String note = scanner.nextLine();
                notes.add(note);
                System.out.println("Note added.\n");
            } else if (input.equals("2")) {
                System.out.println("All Notes:");
                for (int i = 0; i < notes.size(); i++) {
                    System.out.println((i + 1) + ". " + notes.get(i));
                }
                System.out.println();
            } else if (input.equals("3")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Try again.\n");
            }
        }
        scanner.close();
    }
}
