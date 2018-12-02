
//Тип возвращаемого значения

public class Lesson16_Return_Statement_Type {
    public static void main(String[] args) {
        PersonX person1 = new PersonX();
        person1.name = "Pedro";
        person1.age = 20;
        person1.sayHello();
        person1.speak();
        int years1 = person1.calculateYearsToRetirement();//возвращаем сюда значение из метода calculateYearsToRetirement
        System.out.println("Первому до пенсии " + years1);
        PersonX person2 = new PersonX();
        person2.name = "Вова";
        person2.age = 40;
        person2.speak();
        int years2 = person2.calculateYearsToRetirement();//возвращаем сюда значение из метода calculateYearsToRetirement
        System.out.println("Второму до пенсии " + years2);

    }
}

class PersonX {
    String name;
    int age;

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;// Будет возвращать это в Main
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

