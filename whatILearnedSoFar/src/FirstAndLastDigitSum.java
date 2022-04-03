import java.security.spec.RSAOtherPrimeInfo;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {

        System.out.println(sumFirstLastDigitSum(-123));
    }

    public static int sumFirstLastDigitSum(int number){

        int firstDigit = 0;
        int reverseDigt = 0;
        int lastDigit = 0;

        if(number < 0 ){

            return -1;
        }
        lastDigit = number % 10;

        while (number > 0){

            int digit = number % 10;

            reverseDigt = (reverseDigt ) * 10 + digit;

            number = number/ 10;
        }

        firstDigit = reverseDigt % 10;
        return firstDigit + lastDigit;

    }
}
