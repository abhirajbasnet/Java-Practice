public class PerfectNumber {

    public static void main(String [] args){

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number){

        int sum = 0;

        if (number > 1){
            for(int i = 1; i < number; i++){
                if(number % i == 0){
                    sum += i;
                }
            }if(number == sum){
                return true;
            }
        }
        return false;
    }
}
