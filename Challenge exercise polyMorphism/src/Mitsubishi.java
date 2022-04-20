public class Mitsubishi extends Car {
    public Mitsubishi() {
        super(6, "Mitsubishi");
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
