import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Weekend.daysWeekend(8);
//        System.out.println(ForElse.evenNumber(23));
//        System.out.println(DigitSumChallenge.sumDigit(125));
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first Name");
        person.setFirstName(scanner.nextLine());

        System.out.println("Enter your last Name");
        person.setLastName(scanner.nextLine());

        System.out.println("Enter the name of Continent you are from:");
        person.setContinent(scanner.nextLine());

        while(true) {
            System.out.println("Enter your age");
            boolean hasAnInt = scanner.hasNextInt();
            if (hasAnInt) {
                person.setAge(scanner.nextInt());
                break;
            } else {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }

        System.out.println("Your name is "  + person.getName() + ". You are " + person.getAge() +" years old and you are from " + person.getContinent()  );

        scanner.close();


    }
}
