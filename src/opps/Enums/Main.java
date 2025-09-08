package opps.Enums;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Enums = A special kind of class but represents a fixed set of constants.
        //        they improve code readability and reliability.more efficient with switches than string.


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week :");
        String d = sc.nextLine().toUpperCase();


        try {
            Day day = Day.valueOf(d);
            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is the week day");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is the weekend");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("pls Enter a day of week");
        }
        sc.close();
    }
}