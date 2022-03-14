public class soFarLearned {

    public static void main(String[] arg){

        //main code for the java code
        /*
         * Variable are the way of storing the data in the computer memory by the given data type and name by us where computer does the hard part
         * whatever inside the parenthesis is the parameter, period
         * Different theory, method class, data type, primitive type, wrapper class,
         * There are 8 primitive data types int, long, double, boolean, float, short, char, byte
         * wrapper class are those class of the primitive type which helps to operate the java functions of the primitive type
         * Java operative simply known as (+ - \ *)
         *
         */

        //short, Byte, int, Long

        byte myMinimumByteValue = Byte.MIN_VALUE;
        byte myMaximumByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value = " + myMinimumByteValue);
        System.out.println("Maximum Byte Value = " + myMaximumByteValue);

        short myMinimumShortValue = Short.MIN_VALUE;
        short myMaximumShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short Value = " + myMinimumShortValue);
        System.out.println("Maximum Short Value = " + myMaximumShortValue);

        int myMinimumIntValue = Integer.MIN_VALUE;
        int myMaximumIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Int Value = " + myMinimumIntValue);
        System.out.println("Maximum Int Value = " + myMaximumIntValue);

        int myIntOverFlowValue = 2147483647 + 1; //perfect example of the overflow it is  because int cannot store more than its maximum storage so its loses the data and print as -
        System.out.println(myIntOverFlowValue);
        int myIntUnderFlowValue = -2147483647 - 1; // example of the underflow
        System.out.println(myIntUnderFlowValue);
        //so to counter attack the problem of int we use long

        long myMinimumLongValue = Long.MIN_VALUE;
        long myMaximumLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value = " + myMinimumLongValue);
        System.out.println("Maximum Long Value = " + myMaximumLongValue);

        //Casting which means to treat or convert a number from one type to another
        int value = 50000;










    }
}
