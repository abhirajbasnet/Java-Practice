public class Holden extends Car {
    public Holden() {
        super(6, "Holden");
    }
    public String startEngine(){
        return getClass().getSimpleName() + " -> start Engine()";
    }
    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate()";
    }
    public String brake(){
        return getClass().getSimpleName() + " -> brake()";
    }
}
