import java.io.*;

public class Exp8_FileHandling {
    public static void main(String[] args) {
        String filename = "output.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a test file.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e);
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}
