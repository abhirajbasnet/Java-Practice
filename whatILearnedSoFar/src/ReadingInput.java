import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);// where system.in means it inputs the data into the program and runs it
        while (counter < 10){
            int order = 1 + counter;
            System.out.println("Enter number #" + order + ":");

            boolean hasAnInt = scanner.hasNextInt();
            if(hasAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;

//                if(counter == 10){
//                    break;
//                }

            }else {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of the number is " + sum);
            scanner.close();
    }
}
