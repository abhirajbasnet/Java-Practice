public class Main {
    public static void main(String[] args) {

      String duration =  getDurationString(61, 0); // can be also written as System.out.println(getDurationString(61, 0);
        System.out.println(duration);

        String seconds = getDurationString(5600);
        System.out.println(seconds);

    }

    public static String getDurationString(int minutes, int seconds ){

        if (minutes < 0 || seconds < 0 || seconds > 59){

            return "Invalid Value";
        }

        int hours =  minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + " hours " + remainingMinutes + " minutes " + seconds + " seconds";

    }

    public static String getDurationString(int seconds){

        if(seconds < 0){

            return "Invalid Value";
        }

        int minutes = seconds / 60;
        int remaingSeconds = seconds % 60;

        return getDurationString(minutes, remaingSeconds);

    }
}
