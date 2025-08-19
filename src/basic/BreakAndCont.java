package basic;

public class BreakAndCont {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            if(i==5)
            {
                //break;//it will print till 4
                continue; //it will skip current iteration 5
            }
            System.out.println(i + " ");
        }
    }
}
