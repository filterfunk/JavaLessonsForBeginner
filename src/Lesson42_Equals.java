import java.util.Objects;

public class Lesson42_Equals {
    public static void main(String[] args) {
        Persons person1 = new Persons(1);
        Persons person2 = new Persons(2);

        System.out.println(person1.equals(person2));
    }
}

class Persons {
    private int id;

    public Persons(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Persons otherPersons = (Persons) obj;

        return this.id == otherPersons.id;
    }
}
