public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(""); // first name is set to empty String
        person.setLastName(""); // last name is set to empty string
        person.setAge(100);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setFirstName("John"); // first name is set to John
        person.setAge(18);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setLastName("Smith"); //last name is set to smith
        System.out.println("FullName = " + person.getFullName());

    }
}
