import java.util.InputMismatchException;
import java.util.Scanner;

public class EXCEPTION {
    public static void main(String[] args) {
        //Exception = an event that interrupts the normal flow of a program surround any dangerous code
                    //with a try{} bloack.

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a nummber : ");
            int num = sc.nextInt();;
            System.out.println(num);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Pls enter a number");
        }
        catch (Exception e)
        {
            //Safety Net
            System.out.println("Something went wrong");
        }
        finally {
            sc.close();
            System.out.println("It Always executes");
        }
    }
}
