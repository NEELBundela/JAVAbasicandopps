package basic;

import java.util.Scanner;

public class MaTHS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double x;
        double y;


        System.out.println("Enter side of x:");
        x=sc.nextDouble();
        System.out.println("Enter side of y:");
        y=sc.nextDouble();

        double a=Math.sqrt((x*x)+(y*y));

        System.out.println(a);
        sc.close();
    }
}
