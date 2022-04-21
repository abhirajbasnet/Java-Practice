import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bills Burger." + "\n" +"How are you today?" );
        Addition addition = new Addition("Lettuce","Cucumber","Onion","Carrot","Cheese","Tomato");
        System.out.println(addition.getAddition1());
        Hamburger hamburger = new Hamburger("White","Pork", 6);
        hamburger.addAddition(addition.getAddition1());
        hamburger.addAddition(addition.getAddition2());
        hamburger.addAddition(addition.getAddition3());

    }
}
