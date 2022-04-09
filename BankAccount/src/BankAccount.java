public class BankAccount {

    private int accountNumber;
    private double balance;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(000,000,"Default FirstName","Default lastName","DefaultEmail@email.com", "000 0000 000");
        System.out.println("Empty Constructor called");
    }

    public BankAccount(int accountNumber, double balance, String firstName, String lastName, String email, String phoneNumber){
        //System.out.println("Account Number with Constructor called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String firstName, String lastName, String email, String phoneNumber) {
        this(000,000,firstName,lastName,email,phoneNumber);
    }

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

    public String getPhoneNumber(){
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

    public void setPhoneNumber(String phoneNumber){
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
