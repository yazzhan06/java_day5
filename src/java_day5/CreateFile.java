package interview_task;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            // Specify the file name
            FileWriter writer = new FileWriter("example.txt");
            
            // Write data to the file
            writer.write("Hello, this is a sample text file created using Java.");
            
            // Close the writer to save the file
            writer.close();
            
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}
