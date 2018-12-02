import java.util.Scanner;

// Цикл do while

public class Lesson8_Do_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        do {
            System.out.println("Введи пять");
            value = scanner.nextInt();

        } while (value != 5);
        System.out.print("Ты ввёл пять!");
    }
}