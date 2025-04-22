public class CheckingAccount extends Account{
    // attribute
    private double transfer;
    private double withdraw;

    // constructor
    CheckingAccount(String type, double balance, String accountHolder){
        super(type, balance, accountHolder);
    }

    // function to displaying account's information
    public void display(){
        System.out.println("Type\t: " + this.getType());
        System.out.println("Balance\t: " + this.getBalance());
        System.out.println("Account Holder\t: " + this.getAccountHolder() + "\n");
    }
}
