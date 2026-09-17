# System Architecture

The project follows a simple layered structure.

```text
User
  |
  v
Main.java
  |
  +--------------------+
  |                    |
  v                    v
InputValidator    ComplaintManager
                       |
                       v
                  Complaint
                       |
                       v
                  FileManager
                       |
                       v
              data/complaints.txt
```

## Flow

1. The user interacts with `Main.java`.
2. `InputValidator` checks and collects valid input.
3. `ComplaintManager` performs complaint operations.
4. `Complaint` stores complaint information.
5. `FileManager` saves and loads complaint records.
