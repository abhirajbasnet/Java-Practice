public class Weekend {

    public static void daysWeekend(int days){
        if(days < 0 || days > 7 ){
            System.out.println("Invalid Parameter");
        }
        switch(days){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("Yes its a weekend");
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("Yes its a weekend");
                break;
            default:
                System.out.println("Its not a weekend");
        }

    }

}
