public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(5);

    }

    public static void printSquareStar(int number){

        if(number >= 5){
            for (int i = 0; i < number; i++){

                for (int j = 0; j < number; j ++){
                    if ( i == 0 || j == 0 || i == j|| i == (number -1) || j == (number -1) || (i + j) == (number -1) ){
                        System.out.print("x");
                        //if none of the statement work then nust leave a space
                        // on that column
                    }else {
                        System.out.print(" ");
                    }

                }
                System.out.println();// creates a new row
            }


        }if(number < 5){
            System.out.println("Invalid Value");
        }
    }
}
