import java.util.Locale;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String continent;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public String getContinent(){
        return continent;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setContinent(String continent){
        String validContinent = continent.toLowerCase();
        if (validContinent.equals("antarctica") || (validContinent.equals("asia")) || (validContinent.equals("africa")) || (validContinent.equals("north america")) ||
                (validContinent.equals("south america")) || (validContinent.equals("europe"))){
            this.continent = continent;
        }else {
            System.out.println("There is no such Continent");
        }

    }

    public String getName(){
        return firstName + " " + lastName;
    }
}
