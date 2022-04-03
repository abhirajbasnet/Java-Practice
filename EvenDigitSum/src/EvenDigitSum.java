public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int beginingNumber = number;
        int sumEvenDigit = 0;
        if(number >=0){
            while (number > 0){
                int lastDigit = number % 10;
                if (lastDigit % 2 == 0){
                    sumEvenDigit += lastDigit;
                }
                number = number / 10;
            }

        }
        if(number < 0){
            System.out.println("Invalid Parameter");
            return -1;
        }

        System.out.println("The sum of even number of " + beginingNumber + " is " + sumEvenDigit);

        return sumEvenDigit;
    }
}
