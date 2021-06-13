public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal("Pluto", 10);
        Cat c = new Cat("Garfield", 6);

        a.greet(); 			// Animal Pluto says: Huh?
        c.greet(); 			// Cat Garfield says: Meow!

        a = c;
        ((Cat) a).greet(); 	// Cat Garfield says: Meow!
        a.greet(); 			// Cat Garfield says: Meow!
    }
}