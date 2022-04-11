package javapractice.abhi;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog( String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat ){
        super(name,1, 1, size, weight); //class the constructor that we are extending from which means we are inheriting it.
        this.eyes = eyes;
        this.legs = legs;
        this.tail= tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew(){
        System.out.println("chew() method called");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk called()");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run called");
        move(10);

    }
}
