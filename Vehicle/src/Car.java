public class Car extends Vehicle{

    private int wheels;
    private int gears;
    private int seats;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String color, int wheels, int gears, int seats, boolean isManual) {
        super(name, "Metal",4, 4, 2, 2, color);
        this.wheels = wheels;
        this.gears = gears;
        this.seats = seats;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction );

    }

}

