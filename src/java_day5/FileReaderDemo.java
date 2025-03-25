package interview_task;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            // Provide a file name in the current directory or give the full path
            FileReader reader = new FileReader("C:\\Users\\malat\\eclipse-workspace\\interview_task\\src\\interview_task\\file");
            int character;
            System.out.println("File Contents:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Print characters without adding extra lines
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
