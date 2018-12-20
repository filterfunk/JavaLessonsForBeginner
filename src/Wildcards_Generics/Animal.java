package Wildcards_Generics;

public class Animal {
    // Конструктор без параметров чтобы Dogs мог наследоваться
    public Animal() {

    }

    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public String toString() {
        return String.valueOf(id);
    }
}