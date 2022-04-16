public class Kitchen {
    private String utensils;
    private int taps;
    private String spices;
    private int chairs;

    public Kitchen(String utensils, int taps, String spices, int chairs) {
        this.utensils = utensils;
        this.taps = taps;
        this.spices = spices;
        this.chairs = chairs;
    }

    public void openTheDoor(){
        System.out.println("Opening the kitchen room");
    }

    public String getUtensils() {
        return utensils;
    }

    public int getTaps() {
        return taps;
    }

    public String getSpices() {
        return spices;
    }

    public int getChairs() {
        return chairs;
    }
}
