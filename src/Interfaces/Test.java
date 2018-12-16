package Interfaces;

public class Test {
    public static void main(String[] args) {
//        Animal animal1 = new Animal(10);
//        Person person1 = new Person("Pedro");
//        animal1.sleep();
//        person1.sayHello();
//        animal1.showInfo();
//        person1.showInfo();

        // Можно ссылаться на объекты интерфейса Info
        Info info1 = new Animal(15);
        Info info2 = new Person("Sidor");
        info1.showInfo();
        info2.showInfo();
    }
}
