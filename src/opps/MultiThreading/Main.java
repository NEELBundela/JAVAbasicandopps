package opps.MultiThreading;

public class Main {
    public static void main(String[] args) {

        //MultiThreading= Enables a program to run multiple threads
        //                  (Thread = a set of instruction that run independently)


        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        System.out.println("Game star!");
        thread1.start();
        thread2.start();
        try {
            thread1.join();//used to make one thread wait for the completion of another thread
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Game Over!");
    }
}
