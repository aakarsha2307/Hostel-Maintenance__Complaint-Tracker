import java.util.Scanner;

public class InputValidator {

    public static int readPositiveInt(Scanner scanner, String message) {

        while (true) {

            System.out.print(message);

            try {

                int value = Integer.parseInt(scanner.nextLine());

                if (value > 0)
                    return value;

                System.out.println("Enter a positive number.");

            } catch (NumberFormatException e) {

                System.out.println("Invalid input. Enter a number.");
            }
        }
    }

    public static String readNonEmpty(Scanner scanner, String message) {

        while (true) {

            System.out.print(message);

            String value = scanner.nextLine().trim();

            if (!value.isEmpty() && !value.contains("|"))
                return value;

            System.out.println("Input cannot be empty.");
        }
    }

    public static String readCategory(Scanner scanner) {

        System.out.println("\nSelect Category:");
        System.out.println("1. Electrical");
        System.out.println("2. Plumbing");
        System.out.println("3. Cleaning");
        System.out.println("4. Furniture");
        System.out.println("5. Internet");
        System.out.println("6. Room Maintenance");
        System.out.println("7. Other");

        int choice = readPositiveInt(scanner, "Enter choice: ");

        switch (choice) {

            case 1: return "Electrical";
            case 2: return "Plumbing";
            case 3: return "Cleaning";
            case 4: return "Furniture";
            case 5: return "Internet";
            case 6: return "Room Maintenance";
            case 7: return "Other";

            default:
                return "Other";
        }
    }

    public static String readPriority(Scanner scanner) {

        System.out.println("\nSelect Priority:");
        System.out.println("1. Low");
        System.out.println("2. Medium");
        System.out.println("3. High");

        int choice = readPositiveInt(scanner, "Enter choice: ");

        switch (choice) {

            case 1: return "Low";
            case 2: return "Medium";
            case 3: return "High";

            default:
                return "Medium";
        }
    }

    public static String readStatus(Scanner scanner) {

        System.out.println("\nSelect Status:");
        System.out.println("1. Submitted");
        System.out.println("2. In Progress");
        System.out.println("3. Resolved");

        int choice = readPositiveInt(scanner, "Enter choice: ");

        switch (choice) {

            case 1: return "Submitted";
            case 2: return "In Progress";
            case 3: return "Resolved";

            default:
                return "Submitted";
        }
    }
}