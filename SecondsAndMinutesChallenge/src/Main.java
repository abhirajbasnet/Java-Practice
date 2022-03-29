public class Main {
    public static void main(String[] args) {

      String duration =  getDurationString(65, 45); // can be also written as System.out.println(getDurationString(61, 0);
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

        String hoursString = hours + "h ";
        if(hours < 10){

            hoursString = "0" + hoursString;
        }

        String minutesString = minutes + "m ";
        if(minutes < 10){

            minutesString = "0" + minutesString;
        }

        String secondString = seconds + "s ";
        if(seconds < 10){
            secondString = "0" + secondString;
        }

        return hoursString + minutesString + secondString;

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
