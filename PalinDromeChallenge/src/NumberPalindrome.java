public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int firstNumber = number;
        System.out.println(number);
        while (number != 0){

            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;

            number =number / 10;

        }

        if((firstNumber == reverse) ){
            return true;
        }
        return false;


    }




}
