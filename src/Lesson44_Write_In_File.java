import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lesson44_Write_In_File {

    public static void main(String[] args) throws FileNotFoundException {
        String k1 = "Строка 45";
        String k2 = "Строка 55";
        WriteInFile(k1, k2);
    }

    public static void WriteInFile(String k1, String k2) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "Denis" + separator + "Desktop" + separator + "Запись в файл.txt";

        File file = new File(path);

        PrintWriter pw = new PrintWriter(file);

        pw.println(k1);
        pw.println(k2);

        pw.close();

        System.out.println("Я записал в файл значения\n" + k1 +"\n" + k2);
    }
}