public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(19, 99));
//        System.out.println(hasSharedDigit(19, 99));
//        System.out.println(hasSharedDigit(15, 55));
//        System.out.println(hasSharedDigit(12, 43));

    }

    public static boolean hasSharedDigit(int a, int b) {
        int firstParamter = a;
        int secondParameter = b;

        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
              int  aLastDigit = a % 10;
              int bLastDigit = b % 10;

              int aFirstDigit = a /10;
              int bFirstDigit = b /10;

            if ((aFirstDigit == bFirstDigit) || (aFirstDigit == bLastDigit) || (aLastDigit == bFirstDigit) || (aLastDigit == bLastDigit)) {
                System.out.println("Numbers are common");
                System.out.println("The digits in numbers " + firstParamter + " and " + secondParameter + " share a common number");
                return true;
            }
            }
        System.out.println("Invalid Parameter");
        return false;
    }
}
