import java.sql.SQLOutput;

public class NumberToWords {

    public static void main(String[] args) {

        //numberToWords(123);
        System.out.println(getDigitCount(23234));

        //System.out.println(reverse(12389));


    }

    public static void numberToWords(int number) {

        if (number > 0) {
            for (int i = 1; i < number; i++){
                int lastDigit = number % 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Parameter");
                        break;
                }
            }


        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {

        int reverseNumber = number;
        int reverseDigit = 0;

        for (int i = 1; i < number; i++) {
            int reverseNumb = number % 10;
            reverseDigit = (reverseDigit * 10) + reverseNumb;
            number = number / 10;
            //System.out.println(reverseNumb);
            //System.out.println(reverseNumber);
            System.out.println(reverseDigit);

        }

        return number;

    }

    public static int getDigitCount(int number) {

        int count = 0;
        int divisor = 0;

        if (number > 0) {

            for (int i = 0; i < number; i++)
             divisor = number % 1;
            count++;

                    number = number / 10;

            return count;


        } else {
            return -1;
        }

    }
}
