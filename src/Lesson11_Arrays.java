
// Массивы

public class Lesson11_Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
    }
}
