#  Hostel Maintenance & Complaint Tracker

### Programming in Java – Academic Project

**Submitted By:** Aakarsha Parashar
**Registration Number:** 25BAI10492
**Course:** Programming in Java
**Academic Year:** 2026–27

---

##  Project Overview

The **Hostel Maintenance & Complaint Tracker** is a Java-based console application developed to help hostel students report and track maintenance-related problems.

The system allows users to **submit, view, search, update, and delete complaints**. It also provides complaint statistics and separates complaints based on their status and priority.

The application uses **file handling** to store complaint records permanently, so the data remains available even after the program is closed.

---

##  Objectives

* Record hostel maintenance complaints digitally.
* Organize complaints based on category and priority.
* Track the status of complaints.
* Search complaints quickly.
* Store complaint records using file handling.
* Demonstrate Java Object-Oriented Programming concepts.
* Implement collections, validation, and exception handling.

---

##  Features

1.  **Submit Complaint**
2.  **View All Complaints**
3.  **Search Complaint**
4.  **Update Complaint Status or Priority**
5.  **Delete Complaint**
6.  **View Pending Complaints**
7.  **View Resolved Complaints**
8.  **View Complaint Summary**
9.  **Save and Load Complaint Data**

---

##  Technologies Used

* **Programming Language:** Java
* **JDK:** 17 or later
* **Concepts:** Object-Oriented Programming
* **Collections:** ArrayList
* **File Handling:** Java File I/O
* **Exception Handling:** Java Exceptions
* **IDE:** Visual Studio Code / IntelliJ IDEA / Eclipse
* **Version Control:** Git & GitHub

---

##  Java Concepts Used

### Classes and Objects

Classes such as `Complaint` and `ComplaintManager` are used to represent and manage project entities.

### Encapsulation

Complaint attributes are declared private and accessed using appropriate methods.

### Constructors

Constructors are used to initialize complaint objects.

### ArrayList

An `ArrayList` is used to dynamically store multiple complaint records.

### Methods

Different methods are used for submitting, searching, updating, deleting, and displaying complaints.

### Exception Handling

Exception handling is implemented to manage invalid input and file-related errors.

### File Handling

Complaint records are stored in a text file so that data persists between program executions.

### String Handling

String operations are used for keyword-based complaint searching.

---

##  System Design

The project consists of the following main components:

| Component          | Responsibility                         |
| ------------------ | -------------------------------------- |
| `Main`             | Controls the menu and user interaction |
| `InputValidator`   | Validates user input                   |
| `ComplaintManager` | Manages complaint records              |
| `Complaint`        | Represents an individual complaint     |
| `FileManager`      | Saves and loads complaint data         |

---

##  Data Flow

```text
User
  ↓
Main
  ↓
InputValidator
  ↓
ComplaintManager
  ↓
Complaint
  ↓
FileManager
  ↓
complaints.txt
```

When the application starts, saved complaints are loaded from the data file.

Whenever a complaint is added, updated, or deleted, the latest records are saved back to the file.

---

##  Project Structure

```text
Hostel-Maintenance-Complaint-Tracker/
│
├── src/
│   ├── Main.java
│   ├── Complaint.java
│   ├── ComplaintManager.java
│   ├── InputValidator.java
│   └── FileManager.java
│
├── complaints.txt
├── README.md
└── Project_Report.pdf
```

---

##  How to Run

### 1. Clone the Repository

```bash
git clone <your-github-repository-link>
```

### 2. Open the Project

Open the project in **VS Code, IntelliJ IDEA, or Eclipse**.

### 3. Compile the Program

```bash
javac src/*.java
```

### 4. Run the Program

```bash
java -cp src Main
```

---

##  Application Menu

```text
========================================
 HOSTEL MAINTENANCE & COMPLAINT TRACKER
========================================

1. Submit Complaint
2. View All Complaints
3. Search Complaint
4. Update Complaint
5. Delete Complaint
6. View Pending Complaints
7. View Resolved Complaints
8. View Complaint Summary
9. Exit

Enter your choice:
```

---

##  Sample Complaint Summary

```text
========== COMPLAINT SUMMARY ==========

Total Complaints : 3
Submitted        : 1
In Progress      : 1
Resolved         : 1
```

---

##  Testing

| Test Case                     | Expected Result                        |
| ----------------------------- | -------------------------------------- |
| Submit valid complaint        | Complaint is successfully added        |
| Enter invalid numeric input   | User is asked to enter valid input     |
| Search existing room/category | Matching complaints are displayed      |
| Update complaint status       | Complaint status is changed            |
| Delete existing complaint ID  | Complaint is removed                   |
| Restart application           | Previously saved complaints are loaded |

---

##  Future Scope

The project can be further improved by adding:

*  Student and staff login
*  Java Swing or JavaFX GUI
*  JDBC database integration
*  Maintenance staff assignment
*  Complaint notifications
*  Image/photo attachments
*  Web-based interface
*  Mobile application

---

##  Academic Purpose

This project was developed as part of the **Programming in Java** course to demonstrate practical implementation of:

* Object-Oriented Programming
* Classes and Objects
* Encapsulation
* Constructors
* Collections
* File Handling
* Exception Handling
* Input Validation
* String Manipulation

---

## Author

**Aakarsha Parashar**
**Registration No.: 25BAI10492**
**Programming in Java – Academic Project**
**Academic Year: 2026–27**

---

##  References

* Java Platform Documentation
* Java Standard Library Concepts
* Programming in Java Course Notes
* Git Documentation
* GitHub Documentation

---

### Project: Hostel Maintenance & Complaint Tracker

*A simple Java application for managing and tracking hostel maintenance complaints.*

