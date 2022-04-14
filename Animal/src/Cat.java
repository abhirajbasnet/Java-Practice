public class Cat extends Animal {

    //this can be used to refer current class instance variable
    //this can be used to invoke the method class
    //this() can be used to invoke the current class constructor(reusing this. the constructor chain )
    // this: to pass an argument in the method

    private String fur;
    private int teeth;
    private int tail;
    private String gender;
    private int nose;

    public Cat(String name, int brain, int body, int eyes, int legs, String fur, int teeth, int tail, String gender, int nose){
        super(name,brain,body,eyes,legs);
        this.fur = fur;
        this.teeth = teeth;
        this.tail = tail;
        this.gender = gender;
        this.nose = nose;
        //this can be used to refer current class instance variable
    }

    public int getTeeth(int teeth){
        this.teeth = teeth;
        return this.teeth;
    }

    public void eatFood(){
        System.out.println("Cat eats its meal");
    }

    public void mouth(){
        this.eatFood();
        System.out.println("Cat uses its teeth");
    }
    


}
