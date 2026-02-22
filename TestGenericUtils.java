package bluka;

/**
 * Test class for the GenericUtils class.
 * Demonstrates reverse and sum methods.
 */
public class TestGenericUtils {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        GenericUtils.reverse(numbers);
        System.out.print("Reversed Integer array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        String[] words = {"Hello", "World", "Java"};
        GenericUtils.reverse(words);
        System.out.print("Reversed String array: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
        double sumNumbers = GenericUtils.sum(numbers);
        System.out.println("Sum of numbers: " + sumNumbers);
        Double[] decimals = {1.5, 2.5, 3.0};
        double sumDecimals = GenericUtils.sum(decimals);
        System.out.println("Sum of decimals: " + sumDecimals);
    }
}