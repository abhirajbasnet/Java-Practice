public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megabytes = kiloBytes / 1024;// 1 MB = 1024 KB
        // System.out.println("MegaByte = " + megabytes + "Mb");
        int convertedKiloByte = kiloBytes % 1024;

        if (kiloBytes <= 0){
            System.out.println("Invalid Value");
        }else {

            System.out.println(kiloBytes + " KB " + "= " + megabytes + " MB" + " and " + convertedKiloByte + " KB" );
        }
    }
}
