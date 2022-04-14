public class Main {

    public static void main(String[] args){

        Animal animal = new Animal("Animal", 1,1,2,4);
        Dog dog = new Dog("Labrador", 2,4, "Bark", "Silky white", 1,2,1);
        dog.animalSound();
        dog.move(-10);

        Pig pig = new Pig("Rama", 1,1,2,4,"Pink", 60.89,33,2, "hay");
        pig.animalSound();

        Pigeon pigeon = new Pigeon(2,true,1,2,2);
        pigeon.eatWorms();


}
}
