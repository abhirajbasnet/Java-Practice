 class Car{
    private String name;
    private int cylinder;
    private int wheels;
    private boolean engine;

     public Car(String name, int cylinder) {
         this.name = name;
         this.cylinder = cylinder;
         this.wheels = 4;
         this.engine = true;
     }

     public String getName() {
         return name;
     }

     public int getCylinder() {
         return cylinder;
     }

     public void startEngine(){
         System.out.println("Engine is starting ...");
     }

     public void accelerate(){
         System.out.println("Pressing acceleration and car is moving ");
     }
     public void brake(){
         System.out.println("Pressing brake. Car is coming to the stationary");
     }
 }

 class Ferrari extends Car{

     public Ferrari() {
         super("Ferrari", 4);
     }
     public void startEngine(){
         System.out.println("Ferrari Engine is starting...");
     }
     public void accelerate(){
         System.out.println("Pressing acceleration and ferrari is moving ");
     }
     public void brake(){
         System.out.println("Pressing brake. Ferrari is coming to the stationary");
     }
 }

 class Tesla extends Car{
     public Tesla() {
         super("Tesla", 0);
     }
     public void startEngine(){
         System.out.println("Tesla Engine is starting...");
     }
     public void accelerate(){
         System.out.println("Pressing acceleration and Tesla is moving ");
     }
     public void brake(){
         System.out.println("Pressing brake. Tesla is coming to the stationary");
     }
 }

 class Honda extends Car{
     public Honda() {
         super("Honda", 4);
     }
     public void startEngine(){
         System.out.println("Honda engine is starting...");
     }
     public void accelerate(){
         System.out.println("Pressing acceleration and Honda is moving ");
     }
     public void brake(){
         System.out.println("Pressing brake. Honda is coming to the stationary");
     }
 }


public class Main {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        Honda honda = new Honda();
        Tesla tesla = new Tesla();
        Car car = new Car("Lambourgini", 5);

        ferrari.accelerate();
        tesla.accelerate();
        honda.accelerate();
        car.accelerate();

    }
}
