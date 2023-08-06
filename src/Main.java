import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define Scanner method
        Scanner scanner = new Scanner(System.in);

        // Guests list
        String[] guests = {"Irene", "Giancluca", "Andrea", "Vincenzo", "Gloria", "Giulia"};

        // Guest to find
        System.out.println("Inseriri il nome dell'invitato da cercare nella lista!");
        String searchName = scanner.nextLine();

        // Initial search state
        boolean result = false;

        // Search fn
        for (String guest : guests) {
            if (guest == searchName) {
                result = true;
                break;
            }
        }

        // Print Result
        System.out.println((result == true)
        ? searchName + " è tra gli invitati."
        : searchName + " non è tra gli invitati.");

        scanner.close();
    }

}
