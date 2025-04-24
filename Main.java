public class Main{
    public static void main(String[] args) {
        // make account object
        /* CheckingAccount c_account1 = new CheckingAccount("Checking", 0, null);
        c_account1.setBalance(20000);
        c_account1.setAccountHolder("Joel");
        c_account1.display(); */

        SavingsAccount s_account1 = new SavingsAccount("Saving", null);
        s_account1.setAccountHolder("Ellie");
        s_account1.display();
        s_account1.addBalance(50000);

        SavingsAccount s_account2 = new SavingsAccount("Saving", null);
        s_account2.setAccountHolder("Tess");
        s_account2.display();

        s_account1.transfer(25000, s_account2);

        s_account2.display();


    }
}