
// Параметры метода

public class Lesson17_Methods_Parameters {
    public static void main(String[] args) {
        PersonA person1 = new PersonA();
        person1.setNameAndAge("Pedro",20);// Здесь передаём параметры для метода setNameAndAge
        person1.sayHello();
        person1.speak();
        int years1 = person1.calculateYearsToRetirement();
        System.out.println("Первому до пенсии " + years1);
        PersonA person2 = new PersonA();
        person2.setNameAndAge("Вова",20);// Здесь передаём параметры для метода setNameAndAge
        person2.speak();
        int years2 = person2.calculateYearsToRetirement();
        System.out.println("Второму до пенсии " + years2);

    }
}

class PersonA {
    String name;
    int age;

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

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

