package lab5;

public class Account {
    private double balance;
    
    public Account(double initialBlance){
        if(initialBlance > 0.0){
            balance = initialBlance;
        }
    }
    public void credit(double amount){
        balance = balance+ amount;
    }
    public double getBalance(){
        return balance;
    }
}