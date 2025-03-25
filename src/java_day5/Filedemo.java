package interview_task;
import java.io.*;

public class Filedemo {
    public static void main(String[] args) {
        try {
            // Provide the file name with a valid path
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));

            // Writing to the file
            writer.write("Java file handling example");
            writer.newLine();
            writer.write("BufferedWriter makes writing more efficient");
            writer.close();

            System.out.println("Data written to the file successfully");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}

