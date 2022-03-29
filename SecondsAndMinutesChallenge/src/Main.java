public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value"; // introduced a constant variable

    public static void main(String[] args) {

      String duration =  getDurationString(65, 45); // can be also written as System.out.println(getDurationString(61, 0);
        System.out.println(duration);

        String seconds = getDurationString(5600);
        System.out.println(seconds);

    }

    private static String getDurationString(int minutes, int seconds ){

        if (minutes < 0 || seconds < 0 || seconds > 59){

            return INVALID_VALUE_MESSAGE;
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

    private static String getDurationString(int seconds){

        if(seconds < 0){

            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remaingSeconds = seconds % 60;

        return getDurationString(minutes, remaingSeconds);

    }
}
