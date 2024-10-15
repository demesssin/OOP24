package Lab2.Task3;

public class CheckingAccount extends Account{
    private int transactionsCount;
    private static final  int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int accNumber){
        super(accNumber);
        transactionsCount = 0;
    }
    @Override
    public void deposite(double sum){
        super.deposite(sum);
        transactionsCount++;
    }
    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionsCount++;
    }
    public void deductFee(){
        if (transactionsCount > FREE_TRANSACTIONS){
            int chargeableTransaction = transactionsCount - FREE_TRANSACTIONS;
            double fee = chargeableTransaction * TRANSACTION_FEE;
            super.withdraw(fee);
        }
    }
    @Override
    public String toString(){
        return super.toString() + ", Transactions: " + transactionsCount;
    }
}
