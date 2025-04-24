public abstract class Account {
    // attribute
    private String type;
    private String accountHolder;
    private double balance;

    // constructor
    Account(String type, String accountHolder){
        this.type = type;
        this.accountHolder = accountHolder;
    }

    // getter
    public String getType(){
        return this.type;
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }

    public double getBalance(){
        return this.balance;
    }

    // setter
    public void setAccountHolder(String newAccountHolder){
        this.accountHolder = newAccountHolder;
    }

    // abstract method 
    public abstract void display();
    public abstract void transfer(double amount, Account otherAccount);
    public abstract void withdraw(double amount);
    public abstract void addBalance(double amount);
}
