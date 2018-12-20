import java.util.ArrayList;
import java.util.List;

public class Lesson33_Generics {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");

        System.out.println(animals.get(0));

    }
}
