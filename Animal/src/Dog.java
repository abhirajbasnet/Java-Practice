public class Dog extends Animal {

    private String fur;
    private int tail;
    private int ears;
    private int nose;

    public Dog(String name, int eyes, int legs, String animalSound, String fur, int tail, int ears, int nose) {
        super(name, 1, 1, eyes, legs);
        this.fur = fur;
        this.tail = tail;
        this.ears = ears;
        this.nose = nose;
    }

    public String getFur() {
        return fur;
    }

    public int getTail() {
        return tail;
    }

    public int getEars() {
        return ears;
    }

    public int getNose() {
        return nose;
    }

    public void move(int speed) {
        System.out.println("Dog is walking at " + speed);
    }

    public void run(int speed) {
        move(10);
        System.out.println("Dog is running at " + speed);

    }

    public void dogSound() {
        System.out.println(" Dog Barks");
    }

    @Override
    public void animalSound() {
        super.animalSound();
        dogSound();
    }
}
