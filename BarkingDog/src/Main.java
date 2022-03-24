public class Main {

    public static void main (String [] args){

        boolean response = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(response);
        response = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(response);
        response = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(response);
        response = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(response);

    }
}
