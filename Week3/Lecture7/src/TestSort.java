public class TestSort {
    /** Test Sort.sort(). */
    public static void testSort() {
        String[] input = {"I", "have", "an", "egg"};
        String[] expected = {"egg", "an", "have", "I"};

        Sort.sort(input);

        org.junit.Assert.assertEquals(expected, input);

//        for (int i = 0; i <= input.length; i++) {
//            if (!input[i].equals(expected[i])) {
//                System.out.println("Mismatch in position" + i +
//                        ", expected: " + expected[i] + ", but got: " + input[i]);
//                return;
//            }
//        }
    }

    /** Test Sort.findTheSmallest(). */
    public static void testFindSmallest() {
        String[] input = {"there", "are", "many", "pigs"};
        String expected = "are";

        String actual = Sort.findSmallest(input);

        org.junit.Assert.assertEquals(expected, actual);
    }

    /** Test Sort.swap(). */
    public static void testSwap() {
        String[] input = {"there", "are", "many", "pigs"};
        int a = 0;
        int b = 2;
        String[] expected = {"many", "are", "there", "pigs"};

        Sort.swap(input, a, b);

        org.junit.Assert.assertEquals(expected, input);
    }

    public static void main(String[] args) {
//        testSort();
//        testFindSmallest();
        testSwap();
    }
}
