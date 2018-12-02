
//Оператор switch/case

import java.util.Scanner;

public class Lesson10_Switch_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.print("Ты родился");
                break;
            case 7:
                System.out.print("Ты пошёл в школу");
                break;
            default:
                System.out.println("Ни одно из условий");
        }
    }
}
