import java.io.File;
public class FileCreation {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Java Projects\\java.txt");
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}