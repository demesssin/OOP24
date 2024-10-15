package Lab2.Task3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        CheckingAccount chAcc = new CheckingAccount(1);
        SavingsAccount saAcc = new SavingsAccount(2, 3.5);

        bank.openAccount(chAcc);
        bank.openAccount(saAcc);

        chAcc.deposite(570);
        chAcc.withdraw(160);
        saAcc.deposite(100);

        bank.updateAccounts();
        bank.printAcc();
        bank.closeAccount(1);


    }
}
