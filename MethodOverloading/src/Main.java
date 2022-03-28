public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(newScore);

        double centimeter = calcFeetAndInchesToCentimeters(6, 0);
        if (centimeter < 0.0){
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score ){

        System.out.println("Player " + playerName + " Scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score ){

        System.out.println("Unnamed player scored "  + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){

        System.out.println("No player name, no player score");
        return 0;
    }

    //challenge questions

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        // 1 cm = 0.0328084 feet
        // 1 cm = 0.393701 inches
        // 1 inch = 2.54 centimeter
        // 1 foot = 12 inches
        //double centimeter =  feet / 0.0328084 + inches / 0.393701 ;

        if((feet < 0) || (inches < 0 )|| (inches > 12)){

           // System.out.println( centimeter + " Centimeter = "  + feet + " feet " + inches + " inches");
            System.out.println("Invalid feet or Inches parameters");
            return -1;
        }
        double centimeter =  (feet * 12) * 2.54 ;
        //centimeter =  centimeter  + (inches * 2.54);
        centimeter += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeter + " centimeter");
        return centimeter;


    }

    public static double calcFeetAndInchesToCentimeters( double inches){

        if (inches < 0){
            return -1;
        }
        double feet = (int) inches /12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);


    }



}
