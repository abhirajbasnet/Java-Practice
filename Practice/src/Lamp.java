public class Lamp {

    private String color;

    public Lamp(String color) {
        this.color = color;
    }

    public void turnOn(){
        System.out.println("Lamp is turning on..");
    }

    public String getColor() {
        return color;
    }
}
