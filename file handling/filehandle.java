import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandle {
    public static void main(String[] args) {
        try {
            // Write to file
            FileWriter myfile = new FileWriter("myfile.txt");
            myfile.write("Hello, World!\n");
            myfile.write("hellewww");
            myfile.close();

            File f = new File("myfile.txt");
            Scanner sc = new Scanner(System.in);

            System.out.println("Do you want to delete the file? (yes/no)");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                if (f.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("Failed to delete file.");
                }
            } else {
                // Read file
                Scanner reader = new Scanner(f);
                System.out.println("File content:");
                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
                reader.close();
            }

            sc.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}