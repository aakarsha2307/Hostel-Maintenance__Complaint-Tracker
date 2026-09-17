import java.util.Scanner;

public class Main {

    private static int nextComplaintId = 1001;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ComplaintManager manager = new ComplaintManager();

        FileManager.loadComplaints(manager);

        updateNextComplaintId(manager);

        int choice;

        do {

            displayMenu();

            choice = InputValidator.readPositiveInt(
                    scanner,
                    "Enter your choice: "
            );

            switch (choice) {

                case 1:
                    submitComplaint(scanner, manager);
                    break;

                case 2:
                    manager.viewAllComplaints();
                    break;

                case 3:
                    searchComplaint(scanner, manager);
                    break;

                case 4:
                    updateComplaint(scanner, manager);
                    break;

                case 5:

                    int deleteId =
                            InputValidator.readPositiveInt(
                                    scanner,
                                    "Enter Complaint ID to delete: "
                            );

                    manager.deleteComplaint(deleteId);

                    FileManager.saveComplaints(
                            manager.getComplaints()
                    );

                    break;

                case 6:

                    manager.viewByStatus("Submitted");
                    manager.viewByStatus("In Progress");

                    break;

                case 7:

                    manager.viewByStatus("Resolved");

                    break;

                case 8:

                    manager.displaySummary();

                    break;

                case 9:

                    FileManager.saveComplaints(
                            manager.getComplaints()
                    );

                    System.out.println(
                            "\nThank you for using the system!"
                    );

                    break;

                default:

                    System.out.println(
                            "\nInvalid choice. Please select 1-9."
                    );
            }

        } while (choice != 9);

        scanner.close();
    }

    private static void displayMenu() {

        System.out.println("\n========================================");
        System.out.println("     HOSTEL MAINTENANCE TRACKER");
        System.out.println("========================================");

        System.out.println("1. Submit Complaint");
        System.out.println("2. View All Complaints");
        System.out.println("3. Search Complaint");
        System.out.println("4. Update Complaint");
        System.out.println("5. Delete Complaint");
        System.out.println("6. View Pending Complaints");
        System.out.println("7. View Resolved Complaints");
        System.out.println("8. View Complaint Summary");
        System.out.println("9. Exit");

        System.out.println("========================================");
    }

    private static void submitComplaint(
            Scanner scanner,
            ComplaintManager manager) {

        System.out.println(
                "\n========== SUBMIT COMPLAINT =========="
        );

        String studentName =
                InputValidator.readNonEmpty(
                        scanner,
                        "Enter Student Name: "
                );

        String roomNumber =
                InputValidator.readNonEmpty(
                        scanner,
                        "Enter Room Number: "
                );

        String category =
                InputValidator.readCategory(scanner);

        String description =
                InputValidator.readNonEmpty(
                        scanner,
                        "Enter Complaint Description: "
                );

        String priority =
                InputValidator.readPriority(scanner);

        Complaint complaint = new Complaint(
                nextComplaintId++,
                studentName,
                roomNumber,
                category,
                description,
                priority,
                "Submitted"
        );

        manager.addComplaint(complaint);

        FileManager.saveComplaints(
                manager.getComplaints()
        );
    }

    private static void searchComplaint(
            Scanner scanner,
            ComplaintManager manager) {

        String keyword =
                InputValidator.readNonEmpty(
                        scanner,
                        "Enter search keyword: "
                );

        manager.searchComplaints(keyword);
    }

    private static void updateComplaint(
            Scanner scanner,
            ComplaintManager manager) {

        int id =
                InputValidator.readPositiveInt(
                        scanner,
                        "Enter Complaint ID: "
                );

        Complaint complaint = manager.findById(id);

        if (complaint == null) {

            System.out.println("\nComplaint not found.");
            return;
        }

        System.out.println("\n1. Update Status");
        System.out.println("2. Update Priority");

        int choice =
                InputValidator.readPositiveInt(
                        scanner,
                        "Enter choice: "
                );

        if (choice == 1) {

            String status =
                    InputValidator.readStatus(scanner);

            manager.updateStatus(id, status);

        } else if (choice == 2) {

            String priority =
                    InputValidator.readPriority(scanner);

            manager.updatePriority(id, priority);

        } else {

            System.out.println("Invalid choice.");
            return;
        }

        FileManager.saveComplaints(
                manager.getComplaints()
        );
    }

    private static void updateNextComplaintId(
            ComplaintManager manager) {

        for (Complaint complaint : manager.getComplaints()) {

            if (complaint.getComplaintId()
                    >= nextComplaintId) {

                nextComplaintId =
                        complaint.getComplaintId() + 1;
            }
        }
    }
}