package basic;
import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number:");
        int no=sc.nextInt();

        if(no>0){
            System.out.println("Number is positive");
        }else if(no<0){
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is Zero");
        }
    }
}
