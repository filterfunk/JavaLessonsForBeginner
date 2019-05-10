import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class ReadAndWriteInFile {
    public static void main(String[] args) throws FileNotFoundException {
        openFile("Запись в файл.txt");
//        List<String> lines = readFile("Запись в файл.txt");
        readFile("Запись в файл.txt");
        writeInFile("Запись в файл.txt");
    }

    public static File openFile(String fileName) {
        String separator = File.separator;
        String path = separator + "Users" + separator + "Denis" + separator + "Desktop" + separator + "Запись в файл.txt";

        File file = new File(path);
        return file;

    }

    public static void readFile(String fileName) {
        File file = openFile(fileName);
        System.out.print("В этом файле есть строки:\n");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не нашёл такой файл в этом расположении");

        }
    }

    public static List<String> writeInFile(String fileName) throws FileNotFoundException {

            File file = openFile(fileName);

            PrintWriter pw = new PrintWriter(file);
            List<String> lines = new ArrayList<>();

            pw.println("fdfd");
            pw.close();
                  return lines;


        }
    }
//    public static void writeInFile(String fileName) throws FileNotFoundException {
//        File file = openFile(fileName);
//        PrintWriter pw = new PrintWriter(file);
//        String x = "werty";
//        String y = "zxcvb";
//
//        pw.println(x);
//        pw.println(y);
//
//        pw.close();
//
//        System.out.println("Я записал в файл значения:\n" + x +"\n"+ y);
//    }







