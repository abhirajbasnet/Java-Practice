public class Animal {

    private String name;
    private int brain;
    private int body;
    private int eyes;
    private int legs;
    private String animalSound;

    public Animal(String name, int brain, int body, int eyes, int legs, String animalSound){
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.eyes = eyes;
        this.legs = legs;
        this.animalSound = animalSound;
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody(){
        return body;
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public String getAnimalSound(){
        return animalSound;
    }

    public void setAnimalSound(){
        System.out.println("Animal makes noise");
    }

    public void move(){
        System.out.println("Animal.move() called");
    }
}
