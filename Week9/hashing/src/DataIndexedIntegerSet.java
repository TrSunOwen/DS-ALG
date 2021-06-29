public class DataIndexedIntegerSet {
    boolean[] present;

    public DataIndexedIntegerSet() {
        present = new boolean[16];
    }

    public void insert(String s) {
        int intRep = convertToInt(s);
        present[intRep] = true;
    }

    public boolean contain(String s) {
        int intRep = convertToInt(s);
        return present[intRep];
    }

    public static int letterNum(String s, int i) {
        int ithChar = s.charAt(i);
        if ((ithChar < 'a') || (ithChar > 'z')) {
            throw new IllegalArgumentException();}
        return ithChar - 'a' + 1;
    }

    public static int convertToInt(String s) {
        int intRep = 0;
        for (int i = 0; i < s.length(); i++) {
            intRep = intRep << 5; // same as intRep * 32;
            intRep = intRep + letterNum(s, i);
        }
        return intRep;
    }


}