public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        int reverseDigit = 0;
        int firstDigit = 0;
        int lastDigit = 0;

        if (number < 0){
            return -1;
        }
        lastDigit = number %10;

        while (number > 0){

            int reverse = number % 10;

             reverseDigit = (reverseDigit) * 10 + reverse;
             number = number /10;

        }
        firstDigit = reverseDigit % 10;
        return firstDigit + lastDigit;
    }
}
