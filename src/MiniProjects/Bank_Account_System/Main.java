package MiniProjects.Bank_Account_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("*** Welcome to Bank Account System ***");
        System.out.print("Enter Account Number: ");
        int acno=sc.nextInt();
        System.out.print("Enter Your name: ");
        String name=sc.next();
        System.out.print("Enter Balance: ");
        double bal=sc.nextDouble();

        BankAccount ba = new BankAccount(acno,name,bal);
        System.out.println("Customer Account number is" + ba.getAccno() + " " +
                            "Customer name " + ba.getName() + " " +
                            "Balance is " + ba.getBalance());

        while(true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Deposite");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter amount you want to deposite: ");
                double amt = sc.nextDouble();
                ba.deposite(amt);
            } else if (ch == 2) {
                System.out.print("Enter amount you want to withdraw: ");
                double amt = sc.nextDouble();
                ba.withdraw(amt);
            } else if (ch == 3) {
                System.out.println("Your current balance is: " + ba.getBalance());
            } else {
                System.exit(0);
            }
        }



    }
}
