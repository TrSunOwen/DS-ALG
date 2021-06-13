public class Salmon extends Fish {
    String home;

    public Salmon(int w, String h) {
        super(w);
        home = h;
    }

    public Salmon() {
        super();
    }

    @Override
    public void swim() {
        System.out.println("splish splash");
    }

    public void swim(int speed) {
        System.out.println("swimming at " + speed + " mph");
    }
}

