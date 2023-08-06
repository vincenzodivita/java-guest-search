import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define Scanner method
        Scanner scanner = new Scanner(System.in);

        // Guests list
        String[] guests = {"Irene", "Giancluca", "Andrea", "Vincenzo", "Gloria", "Giulia"};

        // Guest to find
        String searchName = "Vincenzo";

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
        ? searchName + " è tra gli invitati"
        : searchName + " è tra gli invitati");
    }
}
