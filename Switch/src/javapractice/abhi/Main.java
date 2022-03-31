package javapractice.abhi;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("was not 1 or 2");
//        }

        int switchValue = 3;
        switch (switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case4:case5:
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }

        //Challenges

        char character = 'F';

        switch (character){

            case 'A':
                System.out.println("A was Found" );
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(character + " was found");
                break;
            default:
                System.out.println("Not found");
                break;

        }

        String month = "January";

        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }

    }
}
