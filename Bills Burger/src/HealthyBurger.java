public class HealthyBurger extends Hamburger {
    private Addition freeAddition1;
    private Addition freeAddition2;
    private Addition addition;

    public HealthyBurger(String meatType, int price, Addition freeAddition1, Addition freeAddition2) {
        super("Brown Rye", meatType, price);
        this.freeAddition1 = freeAddition1;
        this.freeAddition2 = freeAddition2;
    }

    public void processBurger(){
    }


}
