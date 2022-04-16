public class Lamp {
    private String Style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        Style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("The lamp is being turned on");
    }

    public String getStyle() {
        return Style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
