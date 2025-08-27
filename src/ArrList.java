import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {

        //ArrayList = A resizeable array that stores objects,it can change the size.

       /* ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(10);

        ArrayList<String > list2 = new ArrayList<>();

        list2.add("Dhoni");
        list2.add("Kohli");
        list2.add("Sachin");
       //list2.remove(1);
        list2.set(2,"Rohit");
       // System.out.println(list2.get(0));

        Collections.sort(list2); //sorting the arraylist
        Collections.sort(list);*/

        Scanner sc = new Scanner(System.in);

        ArrayList<String> player = new ArrayList<>();
        System.out.print("Enter the # of player you would like: ");
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=num;i++)
        {
            System.out.print("Enter player name #" + i + ": ");
            String name=sc.nextLine();
            player.add(name);
        }
        System.out.println(player);
    }
}
