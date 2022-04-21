public class Hamburger {
    private String breadRollType;
    private String meatType;
//    private String addition1; // lettuce
//    private String addition2; // tomato
//    private String addition3; // carrot
//    private String addition4; // onion
    private int price;

    public Hamburger(String breadRollType, String meatType, int price) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getPrice() {
        return price;
    }
}
