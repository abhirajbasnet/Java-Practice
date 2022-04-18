class Movie {
    private String MovieName;

    public Movie(String movieName) {
        MovieName = movieName;
    }

    public String getMovieName() {
        return MovieName;
    }

    public String plot() {
        return "Nothing in here";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "A boy runs into the maze and try to find the way out";
    }
}

class BucketList extends Movie {
    public BucketList() {
        super("Bucket List");
    }

    @Override
    public String plot() {
        return "A guy and his friends completes all the bucket list task before they died because of the cancer";
    }
}

class Morbius extends Movie {

    public Morbius() {
        super("Morbius");
    }

    public String plot() {
        return "A  diseased doctor turns into a character like vampire where he feeds on the human blood";
    }
}

class SpiderManFarAwayFromHome extends Movie {
    public SpiderManFarAwayFromHome() {
        super("Spiderman Far Away From Home");
    }

    public String plot() {
        return "SpiderMan tries to undo the things he did but luck will not be " +
                "in his favour and get into more trouble and opens the multiverse " +
                "where other SpiderMan from multiverse join hand together for their common foe ";
    }
}

class DoctorStrange extends Movie {
    public DoctorStrange() {
        super("Doctor Strange");
    }
}

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {

            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getMovieName() + "\n" +
                    "Plot: " + movie.plot() + "\n");

        }

    }

    public static Movie randomMovie() {

        int randomNumber = (int) ((Math.random() * 5) + 1);
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new MazeRunner();
            case 2:
                return new BucketList();
            case 3:
                return new Morbius();
            case 4:
                return new SpiderManFarAwayFromHome();
            case 5:
                return new DoctorStrange();
        }
        return null;

    }
}



