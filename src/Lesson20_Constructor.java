
// Конструкторы, перегрузка методов

public class Lesson20_Constructor {
    public static void main(String[] args) {
        Humans human = new Humans("Pedro");
    }
}

class Humans {
    private String name;
    private int age;

    public Humans() {
        this.name = "Имя по умолчанию";
        this.age = 0;
        System.out.println("Конструктор по умолчанию");
    }

    public Humans(String name) {
        System.out.println("Второй конструктор, только имя "+ "-" + " " + name);
        this.name = name;

    }

    public Humans(String name, int age) {
        System.out.println("Третий конструктор, имя и возраст "+ "-" + " " + name + " " + age);
        this.name = name;
        this.age = age;

    }
}