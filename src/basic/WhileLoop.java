package basic;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       /* String name="";

        while(name.isBlank()){
            System.out.println("Enter Your name:");
            name=sc.nextLine();
        }
        System.out.println("Your name is:"+name);*/


        int sn=7;
        int gu=0;
        while (gu!=sn)
        {
            System.out.println("Enter number beetween 1 to 10");
            gu=sc.nextInt();
            if(gu<sn)
            {
                System.out.println("Number is to small");
            }else if(gu>sn)
        {
            System.out.println("Number is to big");
        }else{
                System.out.println("Congratulations!you guss it...");
        }
        }
    }
}
