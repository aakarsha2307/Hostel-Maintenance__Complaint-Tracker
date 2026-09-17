# Class Design

## Complaint

Represents one hostel maintenance complaint.

### Main Attributes

- complaintId
- studentName
- roomNumber
- category
- description
- priority
- status

### Main Methods

- getters
- setters
- `displayComplaint()`
- `toFileString()`

## ComplaintManager

Manages the collection of complaints.

### Main Methods

- `addComplaint()`
- `findById()`
- `viewAllComplaints()`
- `searchComplaints()`
- `updateStatus()`
- `updatePriority()`
- `deleteComplaint()`
- `viewByStatus()`
- `displaySummary()`

## FileManager

Handles permanent storage.

### Main Methods

- `saveComplaints()`
- `loadComplaints()`

## InputValidator

Handles user input validation and menu choices.

### Main Methods

- `readPositiveInt()`
- `readNonEmpty()`
- `readCategory()`
- `readPriority()`
- `readStatus()`

## Main

Controls the application menu and connects all other classes.
