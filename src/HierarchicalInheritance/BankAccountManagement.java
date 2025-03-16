package HierarchicalInheritance;

class BankAccount{
    int accountNumber,balance;
    BankAccount(){
        this.accountNumber=0;
        this.balance=0;
    }
    BankAccount(int accountNumber,int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
}

class SavingAccount extends BankAccount{
    double interestRate;

    SavingAccount(int accountNumber,int balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }

    void accountType(){
        System.out.println("Saving Account");
    }
}

class CheckingAccount extends BankAccount{
    double withdrawlLimit;
    CheckingAccount(int accountNumber,int balance,double withdrawlLimit){
        super(accountNumber,balance);
        this.withdrawlLimit=withdrawlLimit;
    }
    void accountType(){
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount{
    int fixedDepositDuration;
    FixedDepositAccount(int accountNumber,int balance,int fixedDepositDuration){
        super(accountNumber,balance);
        this.fixedDepositDuration=fixedDepositDuration;
    }
    void accountType(){
        System.out.println("FixedDeposit Account");
    }
}


public class BankAccountManagement {
    public static void main(String[] args) {
        SavingAccount a1=new SavingAccount(898089,9808,10);
        a1.accountType();
        CheckingAccount a2=new CheckingAccount(898089,9808,1000.9);
        a2.accountType();
        FixedDepositAccount a3=new FixedDepositAccount(898089,9808,3);
        a3.accountType();
    }
}
