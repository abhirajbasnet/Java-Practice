package javapractice.abhi;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Minimum Value = " + minValue);
        System.out.println("Maximum Value = " + maxValue);
        System.out.println("Busted maximum Value = " + (maxValue + 1));
        System.out.println("Busted minimum value = " + (minValue - 1));

        short myShort = 100;
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Minimum Short Value = " + minShort);
        System.out.println("Maximum Short Value = " + maxShort);
        System.out.println("Busted Minimum Value = " + (minShort - 1));
        System.out.println("Busted Maximum Value = " + (maxShort + 1));

        byte myByte = 100;
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value = " + minByte);
        System.out.println("Maximum Byte Value = " + maxByte);
        System.out.println("Busted Minimum Byte Value = " + (minByte - 1));
        System.out.println("Busted Maximum Byte Value = " + (maxByte + 1));

        long myLong = 1000L;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Minimum Long Value = " + minLong);
        System.out.println("Maximum Long Value = " + maxLong);
        System.out.println("Busted Minimum Long Value = " + (minLong - 1));
        System.out.println("Busted Maximum Long Value = " + (maxLong + 1));
        long bigLongLiteralValue = 2147483647567L;
        System.out.println(bigLongLiteralValue);

        int myNewIntValue = (myValue) / 2 ;
        System.out.println(myNewIntValue);

        short myNewShortValue = (short) ((myShort) /2);
        System.out.println(myNewShortValue);

        byte myNewByteValue = (byte) (myByte / 2);
        System.out.println(myNewByteValue);
        //Cascading
        









    }
}
