import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling{
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void main(String[] args) {
        clearScreen();
        try {
            //! Create 2 files
            File file_1 = new File("file1.txt");
            File file_2 = new File("file2.txt");
            if (file_1.createNewFile()) {
                System.out.println("File created: " + file_1.getName());
            }
            if (file_2.createNewFile()) {
                System.out.println("File created: " + file_2.getName());
            }
            
            //! Write content in one of the files
            FileWriter write = new FileWriter("file1.txt");
            write.write("I like writing");
            write.close();

            //! Read said content
            Scanner scanner = new Scanner(file_1);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println("Writen info: " + data);
            }
            scanner.close();

            //! Delete one of the files and check for the existence for both files
            if (file_2.delete()) { 
                System.out.println("Deleted the file: " + file_2.getName());
            } else {
                throw new IOException( "Failed to delete the " + file_2.getName() + " file");
            }
            
            if (file_1.exists()){
                System.out.println(file_1 + " exists");
            }else{
                System.out.println(file_1 + " does not exist");
            }
            if (file_2.exists()){
                System.out.println(file_2 + " exists");
            }else{
                System.out.println(file_2 + " does not exist");
            }

        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
