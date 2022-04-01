public class SumOddRange {

    public static boolean isOdd(int number){

        if(number < 0){
            return false;
        }else if (number % 2 != 0 ){

            return true;
        }
        return false;
    }

    public static int sumOdd(int start , int end){

        int sum = 0;
        for(int i = start; i <= end; i++){

            System.out.println(i);

            if(isOdd(i)){

                System.out.println(i);
                System.out.println("xxxxxxxx");
                sum = sum + i;
                System.out.println(sum);
            }


        }
        return -1;
    }

}
