package Lab2.Task3;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int accNumber, double interestRate){
        super(accNumber);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        double resultOfAdd = getBalance() * interestRate / 100;
        super.deposite(resultOfAdd);
    }
    @Override
    public String toString(){
        return super.toString() + ", Interest Rate: " + interestRate + "%";
    }
}
