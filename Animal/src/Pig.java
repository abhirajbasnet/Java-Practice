public class Pig extends Animal{

    private String color;
    private double weight;
    private int teeth;
    private int ear;
    private String fodder;

    public Pig(String name, int brain, int body, int eyes, int legs, String color, double weight, int teeth, int ear, String fodder) {
        super(name, 1, 1, eyes, legs);
        this.color = color;
        this.weight = weight;
        this.teeth = teeth;
        this.ear = ear;
        this.fodder = fodder;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getTeeth() {
        return teeth;
    }

    public int getEar() {
        return ear;
    }

    public String getFodder() {
        return fodder;
    }
    
}
