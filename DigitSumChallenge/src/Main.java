public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of the digit is " +sumDigits(1285));


    }

    public static int sumDigits(int number){

        if (number < 10){

            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 -120 = 5

        while(number > 0){
            //extract the least significant digit
            //System.out.println("Initialized number = " + number);
            int digit = number % 10;
            //System.out.println("remainder = " + digit);
            sum +=digit;
            //System.out.println("Sum after reaminder " + sum);
            //System.out.println(number);


            // drop the least significant digit
            number /= 10; // same as number = number /10
            //cSystem.out.println("Divided no " + number);
        }

        return sum;
        }


    }


