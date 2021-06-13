public class Dog implements OurComparable {
    public String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

    /** Return -1 if this < 0
     * Return 0 if this equals 0
     * Return 1 if this > 0
     */
    @Override
    public int compareTo(Object o) {
        Dog anotherDog = (Dog) o;
        if (this.size < anotherDog.size) {
            return -1;
        } else if (this.size == anotherDog.size) {
            return 0;
        } else {
            return 1;
        }
    }
}
