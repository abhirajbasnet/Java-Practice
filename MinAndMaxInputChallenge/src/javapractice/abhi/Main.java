package javapractice.abhi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimumValue = 0;
        int maximumValue = 0;
        boolean first = true;

        while (true) {

            System.out.println("Enter Number");
            boolean hasAnInt = scanner.hasNextInt();

            if(hasAnInt){

                int number = scanner.nextInt();

                if (first){
                    first = false;
                    minimumValue = number;
                    maximumValue = number;
                }

                if(number > maximumValue){
                    maximumValue = number;
                }
                if (number <  minimumValue){
                        minimumValue = number;
                }
                }else {
                break;
            }
        }
        System.out.println("Minmum Value = " + minimumValue + " Maximum Value = " + maximumValue);
        scanner.nextLine();
        scanner.close();

    }
}
