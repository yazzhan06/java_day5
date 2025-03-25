package interview_task;
import java.io.*;

public class CustomFileWriter { 
    public static void main(String[] args) {
        try {
            // Provide the full file path, including the file name
            FileWriter writer = new FileWriter("C:\\Users\\malat\\eclipse-workspace\\interview_task\\example.txt");
            writer.write("Hello all");
            writer.close();
            System.out.println("Data successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
