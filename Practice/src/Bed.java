public class Bed {
    private String name;
    private int sheet;
    private int pillow;
    private int quilt;

    public Bed(String name, int sheet, int pillow, int quilt) {
        this.name = name;
        this.sheet = sheet;
        this.pillow = pillow;
        this.quilt = quilt;
    }

    public void makeBed(){
        System.out.println("Making Bed");
    }
}
