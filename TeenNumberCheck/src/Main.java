public class Main {

    public static void main(String[] args) {

        boolean isTeeen = TeenNumberChecker.hasTeen(9, 99,19);
        System.out.println(isTeeen);
        isTeeen = TeenNumberChecker.hasTeen(23, 15,42);
        System.out.println(isTeeen);
        isTeeen = TeenNumberChecker.hasTeen(22, 23,34);
        System.out.println(isTeeen);

        boolean isTeenn = TeenNumberChecker.isTeen(9);
        System.out.println(isTeenn);
        isTeenn = TeenNumberChecker.isTeen(13);
        System.out.println(isTeenn);

    }
}
