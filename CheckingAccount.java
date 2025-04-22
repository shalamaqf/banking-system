public class CheckingAccount extends Account{
    // attribute
    private double balance;
    private double overdraft = 500000.0;

    // constructor
    CheckingAccount(String type, double balance, String accountHolder){
        super(type, accountHolder);
        this.balance = balance;
    }

    // setter
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    // function to displaying account's information
    public void display(){
        System.out.println("Type\t: " + this.getType());
        System.out.println("Balance\t: " + this.balance);
        System.out.println("Account Holder\t: " + this.getAccountHolder() + "\n");
    }

    // function for money transfer
    public void transfer(double amount){
        if (this.balance > amount){
             this.balance -= amount;
             System.out.println("Money successfully transferred!\n");
        }else{
            System.out.println("Insufficient balance!\n");
        }
    }

    // function for withdraw money
    public void withdraw(double amount){
       if ((this.balance + overdraft) >= amount){
            this.balance -= amount;
            System.out.println("Successfully withdrawed!");
            System.out.println("Your balance : " + this.balance + "\n");
       }else{
        System.out.println("Overdraft limit exceeded!\n");
       }
    }
}
