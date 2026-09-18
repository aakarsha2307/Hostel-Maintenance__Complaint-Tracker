import java.util.ArrayList;

public class ComplaintManager {

    private ArrayList<Complaint> complaints;

    public ComplaintManager() {
        complaints = new ArrayList<>();
    }

    public ArrayList<Complaint> getComplaints() {
        return complaints;
    }

    public void addComplaint(Complaint complaint) {
        complaints.add(complaint);
        System.out.println("\nComplaint submitted successfully!");
        System.out.println("Complaint ID: " + complaint.getComplaintId());
    }

    public Complaint findById(int id) {
        for (Complaint complaint : complaints) {
            if (complaint.getComplaintId() == id) {
                return complaint;
            }
        }
        return null;
    }

    public void viewAllComplaints() {
        if (complaints.isEmpty()) {
            System.out.println("\nNo complaints found.");
            return;
        }

        System.out.println("\n========== ALL COMPLAINTS ==========");

        for (Complaint complaint : complaints) {
            complaint.displayComplaint();
        }
    }

    public void searchComplaints(String keyword) {

        boolean found = false;
        keyword = keyword.toLowerCase();

        for (Complaint complaint : complaints) {

            if (String.valueOf(complaint.getComplaintId()).contains(keyword)
                    || complaint.getStudentName().toLowerCase().contains(keyword)
                    || complaint.getRoomNumber().toLowerCase().contains(keyword)
                    || complaint.getCategory().toLowerCase().contains(keyword)
                    || complaint.getDescription().toLowerCase().contains(keyword)) {

                complaint.displayComplaint();
                found = true;
            }
        }

        if (!found) {
            System.out.println("\nNo matching complaint found.");
        }
    }

    public void updateStatus(int id, String status) {

        Complaint complaint = findById(id);

        if (complaint == null) {
            System.out.println("\nComplaint not found.");
            return;
        }

        complaint.setStatus(status);
        System.out.println("\nComplaint status updated successfully.");
    }

    public void updatePriority(int id, String priority) {

        Complaint complaint = findById(id);

        if (complaint == null) {
            System.out.println("\nComplaint not found.");
            return;
        }

        complaint.setPriority(priority);
        System.out.println("\nComplaint priority updated successfully.");
    }

    public void deleteComplaint(int id) {

        Complaint complaint = findById(id);

        if (complaint == null) {
            System.out.println("\nComplaint not found.");
            return;
        }

        complaints.remove(complaint);
        System.out.println("\nComplaint deleted successfully.");
    }

    public void viewByStatus(String status) {

        boolean found = false;

        System.out.println("\n========== " + status.toUpperCase()
                + " COMPLAINTS ==========");

        for (Complaint complaint : complaints) {

            if (complaint.getStatus().equalsIgnoreCase(status)) {
                complaint.displayComplaint();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No complaints found.");
        }
    }

    public void displaySummary() {

        int submitted = 0;
        int inProgress = 0;
        int resolved = 0;

        int high = 0;
        int medium = 0;
        int low = 0;

        for (Complaint complaint : complaints) {

            if (complaint.getStatus().equalsIgnoreCase("Submitted"))
                submitted++;

            else if (complaint.getStatus().equalsIgnoreCase("In Progress"))
                inProgress++;

            else if (complaint.getStatus().equalsIgnoreCase("Resolved"))
                resolved++;

            if (complaint.getPriority().equalsIgnoreCase("High"))
                high++;

            else if (complaint.getPriority().equalsIgnoreCase("Medium"))
                medium++;

            else if (complaint.getPriority().equalsIgnoreCase("Low"))
                low++;
        }

        System.out.println("\n========== COMPLAINT SUMMARY ==========");
        System.out.println("Total Complaints : " + complaints.size());
        System.out.println("Submitted        : " + submitted);
        System.out.println("In Progress      : " + inProgress);
        System.out.println("Resolved         : " + resolved);

        System.out.println("----------------------------------------");

        System.out.println("High Priority    : " + high);
        System.out.println("Medium Priority  : " + medium);
        System.out.println("Low Priority     : " + low);
    }
}
