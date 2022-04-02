public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigit(125));
    }

    public static int sumDigit(int number){



        if (number < 10){
            return -1;
        }
        int sum =0;
        while (number > 0){
            // to extract lest significant digit
            int digit = number % 10;
            sum += digit;

            // to discard the lest significant number

            number /= 10;

        }

        return sum;

    }

}
