public class Complaint {
    private int complaintId;
    private String studentName;
    private String roomNumber;
    private String category;
    private String description;
    private String priority;
    private SComplaintManager.javatring status;

    public Complaint(int complaintId, String studentName, String roomNumber,
                     String category, String description,
                     String priority, String status) {

        this.complaintId = complaintId;
        this.studentName = studentName;
        this.roomNumber = roomNumber;
        this.category = category;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public int getComplaintId() {
        return complaintId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayComplaint() {
        System.out.println("----------------------------------------");
        System.out.println("Complaint ID : " + complaintId);
        System.out.println("Student      : " + studentName);
        System.out.println("Room Number  : " + roomNumber);
        System.out.println("Category     : " + category);
        System.out.println("Description  : " + description);
        System.out.println("Priority     : " + priority);
        System.out.println("Status       : " + status);
    }

    public String toFileString() {
        return complaintId + "|" + studentName + "|" + roomNumber + "|"
                + category + "|" + description + "|" + priority + "|" + status;
    }
}