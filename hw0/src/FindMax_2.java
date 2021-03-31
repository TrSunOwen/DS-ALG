/**Exercise 3 */

public class FindMax_2 {

    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int maxNumber = 0;

        for (int i = 0; i < m.length; i++) {
            if (maxNumber <= m[i]) {
                maxNumber = m[i];
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10};
        System.out.println(max(numbers));
    }

}
