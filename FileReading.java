import java.io.File;
import java.util.Scanner;
public class FileReading {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Java Projects\\java.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}