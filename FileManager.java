import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_PATH = "data/complaints.txt";

    public static void saveComplaints(ArrayList<Complaint> complaints) {

        try {

            File directory = new File("data");

            if (!directory.exists()) {
                directory.mkdirs();
            }

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(FILE_PATH));

            for (Complaint complaint : complaints) {
                writer.write(complaint.toFileString());
                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving complaints: "
                    + e.getMessage());
        }
    }

    public static void loadComplaints(ComplaintManager manager) {

        File file = new File(FILE_PATH);

        if (!file.exists()) {
            return;
        }

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty())
                    continue;

                String[] data = line.split("\\|");

                if (data.length == 7) {

                    Complaint complaint = new Complaint(
                            Integer.parseInt(data[0]),
                            data[1],
                            data[2],
                            data[3],
                            data[4],
                            data[5],
                            data[6]
                    );

                    manager.getComplaints().add(complaint);
                }
            }

            reader.close();

        } catch (IOException | NumberFormatException e) {

            System.out.println("Error loading complaints: "
                    + e.getMessage());
        }
    }
}