public class Vehicle {

    private String name;
    private String frame;
    private int tires;
    private int doors;
    private int headlights;
    private int backlights;
    private String color;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String frame, int tires, int doors, int headlights, int backlights, String color){

        this.name = name;
        this.frame = frame;
        this.tires = tires;
        this.doors = doors;
        this.headlights = headlights;
        this.backlights = backlights;
        this.color = color;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public String getFrame() {
        return frame;
    }

    public int getTires() {
        return tires;
    }

    public int getDoors() {
        return doors;
    }

    public int getHeadlights() {
        return headlights;
    }

    public int getBacklights() {
        return backlights;
    }

    public String getColor() {
        return color;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vechivle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vechile.move():Moving at "+  currentVelocity + " in direction " + currentDirection);
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
