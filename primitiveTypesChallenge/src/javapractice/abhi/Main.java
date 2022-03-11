package javapractice.abhi;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 100;
        short myShortValue = 1234;
        int myIntValue = 2345;
        long myLongValue = 50000L + ((myByteValue + myShortValue + myIntValue) * 10L);
        System.out.println(myLongValue);

    }
}
