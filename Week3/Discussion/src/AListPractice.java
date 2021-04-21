public class AListPractice {
    public int[] items;
    private int size;

    public AListPractice() {
        items = new int[10];
        size = 0;
    }

    public void addLast(int x) {
        items[size] = x;
        size = size + 1;
    }

    public static int[] insert(int[] arr, int item, int position) {
        int[] result = new int[arr.length + 1];
        position = Math.min(arr.length, position);

        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }

        result[position] = item;

        for (int i = position; i < (arr.length + 1); i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        AListPractice L = new AListPractice();
        L.addLast(1);
        L.addLast(2);
        L.addLast(3);

        System.out.println(5/2);
    }
}
