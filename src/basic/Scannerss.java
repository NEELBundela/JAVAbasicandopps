package basic;
import java.util.Scanner;

public class Scannerss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your name:");
        String name=sc.nextLine();
        System.out.println("Enter Your age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter fvrt cricketer");
        String cr=sc.nextLine();


        System.out.println("Hello" + name);
        System.out.println("You are" + age + "Years old");
        System.out.println("Your Fvrt cricketer is"+cr);
    }
}
