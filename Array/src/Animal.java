import java.util.Scanner;

public class Animal {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = getNumber(5);
        for (int i = 0; i < myIntArray.length; i ++){
            System.out.println("No position in the array " + i + " added no in the array = " + myIntArray[i]);
        }

    }

    public static int[] getNumber(int number){
        System.out.println("Enter the Number \r");
        int[] value = new int[number];
        for (int i =0; i<value.length; i++){

            value[i] = scanner.nextInt();
        }
        return value;
    }
}

