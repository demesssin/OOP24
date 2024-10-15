package Lab2.Task3;
import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank(){
        accounts = new Vector<>();
    }
    public void openAccount(Account account){
        accounts.add(account);
    }
    public void closeAccount(int accNumber){
        accounts.removeIf(account -> account.getAccNumber() == accNumber);
    }

    public void updateAccounts(){
        for (Account account : accounts){
            if (account instanceof SavingsAccount){
                ((SavingsAccount) account).addInterest();
            } else if(account instanceof CheckingAccount){
                ((CheckingAccount) account).deductFee();
            }
        }
    }
    public void printAcc(){
        for (Account account : accounts){
            account.print();
        }
    }
}

