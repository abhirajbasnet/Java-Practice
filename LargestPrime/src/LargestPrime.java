public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number){

        int largestPrime = 2;
        if( number <= 1){
            return -1;
        }
        while (largestPrime < number){
            if(number % largestPrime != 0){
                largestPrime++;
            }else {
                number = number / largestPrime;
            }
        }

        return number;
    }
}

