package MiniProjects.Bank_Account_System;

public class BankAccount {
    private int Accno;
    private String Name;
    private double balance;

    BankAccount(){
        this.balance=0.0;
    }

    BankAccount(int Accno,String name,double balance)
    {
        this.Accno=Accno;
        this.Name=name;
        this.balance=balance;
    }

    void deposite(double bal)
    {
        if(bal<=0){
            System.out.println("Deposite amount should be more than 0");
        }
        else {

            balance+=bal;
            System.out.println("Your balance after Deposite is: " + balance);
        }

    }

    void withdraw(double bal)
    {
        if(balance>bal)
        {
            balance-=bal;
            System.out.println("Your balance after withdraw is: " + balance);
        }
        else {
            System.out.println("Cannot withdraw more than Balance");

        }
    }

    //getters methods
    int getAccno()
    {
        return this.Accno;
    }
    String getName(){
        return this.Name;
    }
    double getBalance()
    {
        return this.balance;
    }

    //setters Methods
    void setAccno(int Accno)
    {
        this.Accno = Accno;
    }

    void setName(String name){
        this.Name=name;
    }

    void setBalance(double balance)
    {
        this.balance=balance;
    }
}
