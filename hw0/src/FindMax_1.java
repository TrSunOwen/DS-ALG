/** Exercise 2 */

public class FindMax_1 {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int maxNumber = 0;
        int length = m.length;
        int i = 0;
        while (i < length) {
            if (maxNumber <= m[i]) {
                maxNumber = m[i];
            }
            i = i + 1;
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10};
        System.out.println(max(numbers));
    }
}
