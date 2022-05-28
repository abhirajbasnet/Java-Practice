public class TestArray {

    public static void main(String[] args) {
        int a[]= new int[5]; //declaration and instantiation
        //initialization of an array
        a[0] = 10;
        a[1] = 11;
        a[2] = 1;
        a[3] = 3;
        a[4] = 4;
        //transversing an array
        for (int i = 0; i < a.length; i++){ //length is the property of an array
            System.out.println(a[i]);
        }



    }

}
