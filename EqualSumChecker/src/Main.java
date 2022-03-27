public class Main {

    public static void main(String[] args){

        boolean equalSum = EqualSumChecker.hasEqualSum(1,1,1);
        System.out.println(equalSum);
        equalSum = EqualSumChecker.hasEqualSum(1,1,2);
        System.out.println(equalSum);
        equalSum = EqualSumChecker.hasEqualSum(1,-1,0);
        System.out.println(equalSum);
    }

}
