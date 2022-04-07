import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0.00;
        long count = 0;

        while (true) {
            count++;
            boolean hasAnInt = scanner.hasNextInt();
            if (hasAnInt) {
                int number = scanner.nextInt();
                sum += number;
                average =  (double)sum / count;

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        scanner.close();

    }
}
