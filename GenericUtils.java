package bluka;

/**
 * Utility class for generic array operations.
 */
public class GenericUtils {

    /**
     * Reverses the elements of a generic array in-place.
     * @param array the array to reverse
     * @param <T> the type of the array elements
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap elements at positions left and right
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    /**
     * Calculates the sum of a numeric array.
     * Only works with subclasses of Number.
     * @param array the numeric array
     * @param <T> type of the array elements (must extend Number)
     * @return sum of all elements as double
     */
    public static <T extends Number> double sum(T[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            Number item = array[i];
            total = total + item.doubleValue();
        }
        return total;
    }
}