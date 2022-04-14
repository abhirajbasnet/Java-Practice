public class Ford extends Car{
    private int roadServiceMonths;

    public Ford(String name, String color, int wheels, int gears, int seats, boolean isManual, int roadServiceMonths) {
        super("Ford", color, wheels, gears, seats, isManual);
        this.roadServiceMonths = roadServiceMonths;
    }
}
