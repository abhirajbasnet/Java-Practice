public class ForElse {

    public static int evenNumber(int number){

        int count = 0;
        for(int i = 0; i<= number; i++){
            if(i % 2 == 0){
                System.out.println(i);
                count ++;
            }else if(count == 5){
                break;
            }
        }
        return count;
    }
}
