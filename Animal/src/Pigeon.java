public class Pigeon {
    private int wings;
    private boolean feather;
    private int beak;
    private int legs;
    private int eyes;

    public Pigeon(int wings, boolean feather, int beak ){
        this.wings = wings;
        this.feather = feather;
        this.beak = beak;
    }
    //this() keyword to invoke the current class constructor
    public Pigeon(int wings, boolean feather, int beak, int legs, int eyes){
        this( wings,feather, beak);
        this.legs = legs;
        this.eyes = eyes;
    }

    public void eat(Pigeon worms){
        System.out.println("Pigeon eats worm");
    }
//this to pass an argument in the method
    public void eatWorms(){
        eat(this);
    }
}
