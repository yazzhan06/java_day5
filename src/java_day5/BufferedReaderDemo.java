package interview_task;
import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            // Provide a valid file path or name
            BufferedReader r1 = new BufferedReader(new FileReader("example.txt"));
            String line;

            System.out.println("Reading file line by line:");
            while ((line = r1.readLine()) != null) {
                System.out.println(line);
            }
            r1.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
