public class BankAccount {

    private int accountNumber;
    private double balance;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public void depositFunds(double depositAmount){

        if(depositAmount > balance){
            double newBalance = balance + depositAmount;
            System.out.println("Your balance after the deposit of " + depositAmount +  " is " + newBalance);
        }
    }

    public void withdrawFunds(double drawFunds){

        if (drawFunds <= balance){
            double newBalance = balance - drawFunds;
            this.balance = newBalance;
            System.out.println("Your remaining balance after withdraw of " + drawFunds + " is " + balance);
        }else {
            System.out.println("You don't have sufficient fund to withdraw");
        }

    }
}
