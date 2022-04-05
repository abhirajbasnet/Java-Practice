import java.sql.SQLOutput;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(10);

        System.out.println("xxxxxxxxxxx");

        System.out.println(reverse(01));
        System.out.println(reverse(2121));
        System.out.println(reverse(100));
        System.out.println(reverse(4321));

        System.out.println("xxxxxxxxxx");

        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

    }

    public static void numberToWords(int number) {

        int digitCount = getDigitCount(number);
        number = reverse(number);

        if (number > 0) {

            for (int i = digitCount; i > 0; i--) {
                int lastDigit = number % 10;
                number /= 10;


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
                        System.out.println("five");
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
                        System.out.println("Invalid Value");
                        break;
                }
            }
        }else if(number == 0){
            System.out.println("Zero");
        }
        else
        System.out.println("Invalid Value");
    }

    public static int reverse(int number){

        int reverseDigit = 0;

        while (number != 0){

            int reverseNumber = number % 10;
            number /= 10;
            reverseDigit = (reverseDigit * 10) + reverseNumber;

            //System.out.println(reverseDigit);
        }
        return reverseDigit;
    }

    public static int getDigitCount(int number){

        int count = 0;
        if (number > 0){
            while (number != 0){
                number /=10;
                count++;
            }
            return count;
        }else if(number == 0){
            return 1;
        }
        return -1;
    }
}

