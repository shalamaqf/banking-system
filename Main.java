public class Main{
    public static void main(String[] args) {
        // make account object
        CheckingAccount c_account1 = new CheckingAccount("Checking", 0, null);
        c_account1.setBalance(20000);
        c_account1.setAccountHolder("Joel");
        c_account1.display();

        SavingAccount s_account1 = new SavingAccount("Saving", 0, null);
        s_account1.setBalance(1000);
        s_account1.setAccountHolder("Ellie");
        s_account1.display();



    }
}