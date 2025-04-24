public class SavingsAccount extends Account{
    // attribute 
    private double balance;
    private double minimumBalance = 1000.0;
    private double minimumWithDraw = 50000.0;

    // constructor
    SavingsAccount(String type, String accountHolder){
        super(type, accountHolder);
    }

    // function to displaying account's information
    public void display(){
        System.out.println("Type\t: " + this.getType());
        System.out.println("Balance\t: " + this.balance);
        System.out.println("Account Holder\t: " + this.getAccountHolder() + "\n");
    }

    // function for money transfer
    public void transfer(double amount, Account otherAccount){
        if (this.balance > amount && this.balance >= minimumBalance){
             this.balance -= amount;
             otherAccount.addBalance(amount);
             System.out.println("Money successfully transferred!\n");
             System.out.println("Current Balance\t: " + this.balance + "\n");
        }else{
            System.out.println("Insufficient balance to transfer!\n");
        }
    }

    // function for withdraw money
    public void withdraw(double amount){
        if (this.balance >= amount || this.balance >= minimumWithDraw){
             this.balance -= amount;
             System.out.println("Successfully withdrawed!");
             System.out.println("Current balance : " + this.balance + "\n");
        }else{
         System.out.println("Insufficient balance to withdraw!\n");
        }
    }

    // function for add balance
    public void addBalance(double amount){
        this.balance += amount;
        System.out.println("Successfully added balance!");
        System.out.println("Current Balance\t: " + this.balance + "\n");
    }

    // function for add balance by bank interest every month
    public double interest(double balance){
        double currentBalance = balance * 0.2;
        return currentBalance;
    }
} 
