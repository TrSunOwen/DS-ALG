public class TestFish {
    public static void main(String[] args) {
        /** Fish fish = new Fish();
        Salmon salmon = new Salmon();
        Fish bob = new Salmon(); */

        /** fish.swim(); // Success
        salmon.swim(); // Success
        bob.swim(); // Success */

        /** fish.swim(5); // Compiler Error！
        salmon.swim(5); // Success!
        bob.swim(5); // Compiler Error! */

        Fish redFish = new Fish();
        Fish blueFish = new Salmon();

        /** blueFish.swim(5); // Compiler Error! */
        ((Salmon) blueFish).swim(5);
        ((Salmon) redFish).swim(5); // Runtime Error!

    }
}
