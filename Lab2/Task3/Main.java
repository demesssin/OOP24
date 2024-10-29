package Lab2.Task3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount sAcc1 = new SavingsAccount(1,15.0);
        SavingsAccount sAcc2 = new SavingsAccount(2, 15.0);

        CheckingAccount chAcc1 = new CheckingAccount(1);
        CheckingAccount chAcc2 = new CheckingAccount(2);

        sAcc1.deposite(169880);
        sAcc2.deposite(212000);

        sAcc2.transfer(12000, sAcc1);

        System.out.println(sAcc2.getBalance());
        System.out.println(sAcc1.toString());
        System.out.println(sAcc2.toString());

        System.out.println(" ");

        sAcc1.withdraw(18800);
        System.out.println(sAcc1.getBalance());
        sAcc2.addInterest();
        System.out.println(sAcc2.getBalance());

        chAcc1.deductFee();
        System.out.println(chAcc1.toString());
        chAcc1.deposite(150000);
        System.out.println(chAcc1.toString());
        chAcc1.transfer(15600, chAcc2);
        System.out.println(chAcc1.toString());

        bank.openAccount(chAcc1);
        bank.openAccount(chAcc2);
        bank.openAccount(sAcc1);
        bank.openAccount(sAcc2);

        bank.closeAccount(2);

        System.out.println(" ");
        bank.printAcc();
    }
}
