import java.util.Scanner;

// Программа турник

public class Turnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько ты подтянулся?");
        int count = scanner.nextInt();
        System.out.print("Сколько мечтаешь подтянуться?");
        int final_count = scanner.nextInt();
        if (count < final_count) {
            System.out.print("Давай ещё " + (final_count - count));
        } else {
            System.out.print("Красава");
        }


//        switch (count) {
//            case 10:
//                System.out.print("Ты родился");
//                break;
//            case 7:
//                System.out.print("Ты пошёл в школу");
//                break;
//            default:
//                System.out.println("Ни одно из условий");
//        }
    }
}
