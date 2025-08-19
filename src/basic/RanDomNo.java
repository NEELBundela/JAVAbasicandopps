package basic;
import java.util.Random;

public class RanDomNo {
    public static void main(String[] args) {

        Random rc = new Random();

        int x = rc.nextInt(10);
        System.out.println(x);
    }
}
