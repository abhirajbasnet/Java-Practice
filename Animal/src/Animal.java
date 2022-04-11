public class Animal {

    private String name;
    private int brain;
    private int body;
    private int eyes;
    private int legs;

    public Animal(String name, int brain, int body, int eyes, int legs){
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.eyes = eyes;
        this.legs = legs;
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

    public void animalSound(){
        System.out.println("Animal have animal sound");
    }
    public void move(){
        System.out.println("Animal.move() called");
    }
}
