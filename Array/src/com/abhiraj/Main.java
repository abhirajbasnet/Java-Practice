package com.abhiraj;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the First Five Integer");
        int[] myIntegers = getInteger(3);
        for (int i = 0; i < myIntegers.length; i ++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getInteger(int number){

        System.out.println("Enter " + number + " integer Values.\r");

        int[] values = new int[number];
        for (int i = 0; i < values.length; i ++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i =0; i <array.length; i ++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }


}
