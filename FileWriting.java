import java.io.FileWriter;
public class FileWriting {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\Java Projects\\java.txt");
            fileWriter.write("Welcome to Java!!!!");
            fileWriter.close();
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}