import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson37_Exceptions1 {

    public static void main(String[] args) {
//        String separator = File.separator;
//        String path = separator + "Users" + separator + "Denis" + separator + "Desktop" + separator + "test.txt";
        File file = new File("path");

        try {
            Scanner scanner = new Scanner(file);

            System.out.println("После сканера");

        } catch (FileNotFoundException e) {

            System.out.println("Файл не найден");
        }

        System.out.println("После блока try/catch");
    }
}
