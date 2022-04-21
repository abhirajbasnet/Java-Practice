public class Hamburger {
    private String breadRollType;
    private String meatType;
    private Addition addition;
    private int price;

    public Hamburger(String breadRollType, String meatType, int price) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.price = price;

    }

    public void addAddition(String addition){
        System.out.println("Following item is added: " + addition);
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
//    public double getAdditionPrice(){
//        System.out.println("The price of the " + addition.getAddition() + " is " + addition.getPrice());
//        return addition.getPrice();
//    }

    public void total(){
        System.out.println("The total purchase is ");
    }
}
