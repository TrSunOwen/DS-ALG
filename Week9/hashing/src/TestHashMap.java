import java.util.HashMap;


public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap();
        int[] input = new int[]{2, 2, 1, 1, 1, 2, 2};


        for (int i = 0; i < input.length; i++) {
            if (map.containsKey(input[i])) {
                map.put(input[i], 1 + map.get(input[i]));
                if (map.get(input[i]) > (input.length / 2)) {
                    return input[i];
                }
            } else {
                map.put(input[i], 1);
            }
        }


    }

}
