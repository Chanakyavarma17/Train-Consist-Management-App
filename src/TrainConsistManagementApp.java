import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC2 Title
        System.out.println("====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("====================================\n");

        // Step 1: Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display after adding
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Step 4: Remove "AC Chair"
        passengerBogies.remove("AC Chair");

        // Step 5: Display after removing
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Step 6: Check if "Sleeper" exists
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists);

        // Step 7: Final list
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        // End message
        System.out.println("\nUC2 operations completed successfully...");
    }
}