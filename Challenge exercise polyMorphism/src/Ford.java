public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
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
