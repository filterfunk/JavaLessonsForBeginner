
// Инкапсуляция, сеттеры и геттеры

public class Lesson18_Incapsulation {
    public static void main(String[] args) {
        PersonB person1 = new PersonB();
        person1.setName("Pedro");
        person1.setAge(20);
        System.out.println("Выводим значение в main методе: "+ person1.getName());
        System.out.println("Выводим значение в main методе: "+ person1.getAge());
        person1.speak();

    }
}

class PersonB {
    private String name;
    private int age;

// Сеттеры и геттеры

    public void setName(String username) {
        name = username;
    }

    public String getName() {
        return name;
    }

    public void setAge(int userage) {
        age = userage;
    }

    public int getAge() {
        return age;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name);
        }

    }

    void sayHello() {
        System.out.println("Приветики!");
    }
}
