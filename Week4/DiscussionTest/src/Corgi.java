public class Corgi extends Dog {
    public void bark(Corgi c) {
        System.out.println("Method B");
    }

    @Override
    public void bark(Dog d) {
        System.out.println("Method C");
    }

    public void play(Dog d) {
        System.out.println("Method D");
    }

    public void play(Corgi c) {
        System.out.println("Method E");
    }
}
