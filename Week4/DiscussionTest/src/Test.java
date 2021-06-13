public class Test {
    public static void main(String[] args) {
        Dog d = new Corgi();
        Corgi c = new Corgi();

//        d.play(d);
        d.bark(d);
        d.bark(c);
    }
}
