
// for/each, массивы строк

public class Lesson12_For_each {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Java";

//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);

            for (String string:strings){
                System.out.println(string);
            }

        }
    }


