public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setFirstName("Abhiraj");
        bankAccount.setLastName("Basnet");
        bankAccount.setAccountNumber(123456789);
        bankAccount.setBalance(10);
        bankAccount.withdrawFunds(5);
        bankAccount.depositFunds(10);
        bankAccount.setEmail("myemail@gmail.com");
        bankAccount.setPhoneNumber(123456789);

        System.out.println(bankAccount.getName() + "\n" + "Your account balance is " + bankAccount.getBalance() +
                "\n" + "Your phone number is " + bankAccount.getPhoneNumber() + "\n" + "Your email is " + bankAccount.getEmail() );


    }
}
