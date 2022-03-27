public class Main {

    public static void main(String[] args){

        boolean isDecimalByThree = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(isDecimalByThree);
        isDecimalByThree = DecimalComparator.areEqualByThreeDecimalPlaces(3.1755, 3.176);
        System.out.println(isDecimalByThree);
        isDecimalByThree = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(isDecimalByThree);
        isDecimalByThree = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(isDecimalByThree);
    }
}
