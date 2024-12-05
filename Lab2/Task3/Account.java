package Lab2.Task3;

public class    Account{
    private double balance;
    private int accNumber;
    public Account(int accNumber){
        balance = 0.0;
        this.accNumber = accNumber;
    }
    public void deposite(double sum){
        if (sum > 0){
            balance = balance + sum;
        } else {
            System.out.println("Amount can't be negative number");
        }
    }
    public void withdraw(double sum){
        if (sum > 0 && sum <= balance){
            balance = balance - sum;
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getAccNumber(){
        return accNumber;
    }
    public void transfer(double amount, Account other){
        if (amount > 0 && amount <= balance){
            withdraw(amount);
            other.deposite(amount);
        } else{
            System.out.println("Invalid transfer");
        }
    }

    public String toString(){
        return "Account number is: " + getAccNumber() + ", balance is: " + getBalance();
    }
    public final void print(){
        System.out.println(toString());
    }
}
