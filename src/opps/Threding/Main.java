package opps.Threding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Threading = Allows,a program to rin multiple tasks simultaneously

        Scanner sc = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); //this thread is going to end as soon as main thread is finished
        thread.start();

        System.out.println("You have a 5 second to enter your name");
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        sc.close();
    }
}
