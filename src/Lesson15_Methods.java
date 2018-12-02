
// Методы

public class Lesson15_Methods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Pedro";
        person1.age = 20;
        person1.sayHello();
        person1.speak();
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 40;
        person2.speak();
    }
}

class Person {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name);
        }

    }

    void sayHello() {
        System.out.println("Приветики!");
    }

}

