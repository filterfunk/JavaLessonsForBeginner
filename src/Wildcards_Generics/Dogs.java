package Wildcards_Generics;

public class Dogs extends Animal {
    private int id;

    public Dogs(int id) {
        this.id = id;

    }
    public String toString() {
        return String.valueOf(id);
    }
}