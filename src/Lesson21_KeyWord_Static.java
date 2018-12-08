
// Ключевое слово static

public class Lesson21_KeyWord_Static {
    public static void main(String[] args) {
        People man1 = new People("Pedro", 25);
        man1.printNumberOfPeople();
        People man2 = new People("Vasia", 28);
        man2.printNumberOfPeople();
    }
}

class People {
    private String name;
    private int age;

    public static String description;
    public static int countPeople;


    public People(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;

    }

    public static void getDescription() {
        System.out.println(description);
    }

    public static void printNumberOfPeople() {
        System.out.println("Количество человек - " + countPeople);
    }
}