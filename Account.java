public abstract class Account {
    // attribute
    private String type;
    private double balance;
    private String accountHolder;

    // constructor
    Account(String type, double balance, String accountHolder){
        this.type = type;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    // getter
    public String getType(){
        return this.type;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }

    // setter
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public void setAccountHolder(String newAccountHolder){
        this.accountHolder = newAccountHolder;
    }

    // abstract method 
    public abstract void display();
}
