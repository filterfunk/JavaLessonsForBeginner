
// Метод To String и класс Object

public class Lesson24_ToString {
    public static void main(String[] args) {
        Humanoids h1 = new Humanoids("Pedro", 41);
        System.out.println(h1);
    }
}

class Humanoids {
    private String name;
    private int age;

    public Humanoids(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переписываем метод из класса Object
    public String toString() {
        return name + "," + age;
    }

}