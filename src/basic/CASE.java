package basic;
import java.util.Scanner;

public class CASE {
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1. THALA");
        System.out.println("2. KING");
        System.out.println("3. HITMAN");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch=sc.nextInt();

        switch (ch){
            case 1:
                System.out.println("THALA");
                break;
            case 2:
                System.out.println("King");
                break;
            case 3:
                System.out.println("Hitman");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
