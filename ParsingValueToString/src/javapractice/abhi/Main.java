package javapractice.abhi;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.00";
        System.out.println("numberAsString= " + numberAsString);

//       int number = Integer.parseInt(numberAsString);
//        System.out.println("Number = " + number);

        numberAsString += 1;
//        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        //System.out.println("number = " + number);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("DoubleNuber = " + doubleNumber);
    }
}
