import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson36_Reading_from_file {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users"+ separator + "Denis" + separator +"Desktop"+ separator + "Чтение из файла.txt";

        File file = new File(path);

         Scanner scanner = new Scanner(file);
//        String line = scanner.nextLine();

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());

        }
//        String[] numbersString = line.split(" ");
//        int[] numbers = new int[3];
//        int counter = 0;
//
//        for(String number:numbersString){
//            numbers[counter++] = Integer.parseInt(number);
//                    }
//        System.out.println(Arrays.toString(numbers));
//
//        scanner.close();
    }
}
