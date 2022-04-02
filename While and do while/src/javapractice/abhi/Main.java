package javapractice.abhi;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(100));
//
//        int count =0;
//        while (count != 5){
//            System.out.println("Count value is " + count);
//            count ++;
//        }
//
//        //Alternate way of doing while
//
//        while (true){
//            if(count == 6){
//
//                break;
//            }
//            System.out.println("Count Value is " + count);
//            count ++;
//
//        }
//        count =1;
//        do {
//            System.out.println("Count value was " + count);
//            count ++;
//        } while(count !=6);

    }

    public static boolean isEvenNumber(int number){
        int count = 0;
            for (int i =1; i < number; i++ ){

                if(i % 2 == 0) {
                    System.out.println(i);
                    count ++;

                }else if (count == 5){
                    break;
                }
        }
            return false;
    }
}
