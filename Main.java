public class Main{
    public static void main(String[] args) {
        // make account object
        CheckingAccount c_account1 = new CheckingAccount("Checking", 0, null);
        c_account1.setBalance(20000);
        c_account1.setAccountHolder("Joel");
        c_account1.display();

        c_account1.withdraw(21000);
        c_account1.display();


    }
}