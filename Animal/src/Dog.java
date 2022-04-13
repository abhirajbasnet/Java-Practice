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
        if (speed >= 6){
            System.out.println("Dog is running at " + speed);
        }else if(speed <=0){
            System.out.println("Dog is resting");
        }
        else {
            System.out.println("Dog is walking at " + speed);
        }
    }

    public void animalSound() {
        System.out.println("Barks");
    }


}
