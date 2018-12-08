package Nasledovanie;

// Здесь вызываются методы для всех животных

public class Lesson25_Nasledovanie {
    public static void main(String[] args) {
        Rybki fish1 = new Rybki();
        fish1.voice();
        fish1.eat();
        fish1.sleep();
        fish1.showName();
        Kotiki kat1 = new Kotiki();
        kat1.voice();
        kat1.eat();
        kat1.sleep();
        kat1.showName();
        Sobachki pes1 = new Sobachki();
        pes1.voice();
        pes1.eat();
        pes1.sleep();
        pes1.showName();

    }
}
