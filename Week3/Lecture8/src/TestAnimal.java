public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();

        a.greet(d); // hello animal
        a.sniff(d); // dog sniff animal
        d.flatter(d); // u r cool dog
        a.flatter(d); // u r cool animal
    }
}
