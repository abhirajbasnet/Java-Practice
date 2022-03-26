public class DecimalComparator {

    public static boolean areEqualByThreeDecimal(double equal, double threeDecimal){
        int a = (int) equal * 1000;
        int b = (int) threeDecimal * 1000;

        if(a == b){
            System.out.println(true);
            return true;
        }
        else

            System.out.println(false);
        return false;
    }
}
