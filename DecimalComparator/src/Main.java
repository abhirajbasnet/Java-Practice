public class Main {

    public static void main(String[] args){

        boolean isDecimalByThree = DecimalComparator.areEqualByThreeDecimal(3.33, 4.33);
        System.out.println(isDecimalByThree);
        isDecimalByThree = DecimalComparator.areEqualByThreeDecimal(-3.1756, -3.175);
        System.out.println(isDecimalByThree);
        isDecimalByThree = DecimalComparator.areEqualByThreeDecimal(3.175, 3.176);
        System.out.println(isDecimalByThree);
        isDecimalByThree = DecimalComparator.areEqualByThreeDecimal(3.0, 3.0);
        System.out.println(isDecimalByThree);
        isDecimalByThree = DecimalComparator.areEqualByThreeDecimal(-3.123, 3.123);
        System.out.println(isDecimalByThree);
    }
}
