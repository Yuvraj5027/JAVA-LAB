
import java.io.File;

public class File_Creation {
    public static void main(String[] args) {
        File file = new File("D:\\Java Projects\\java.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File doesn't exist");
        }
    }
}