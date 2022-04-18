public class Bed {
    private String style;
    private int height;
    private int sheet;
    private int pillow;
    private int quilt;

    public Bed(String style, int height, int sheet, int pillow, int quilt) {
        this.style = style;
        this.height = height;
        this.sheet = sheet;
        this.pillow = pillow;
        this.quilt = quilt;
    }

    public void makeBed(){
        System.out.println("Bed -> Making Bed | ");
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getSheet() {
        return sheet;
    }

    public int getPillow() {
        return pillow;
    }

    public int getQuilt() {
        return quilt;
    }
}
