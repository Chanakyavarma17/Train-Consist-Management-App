import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Title border
        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Messages
        System.out.println("\nTrain initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist: " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}
