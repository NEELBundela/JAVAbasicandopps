package basic;

public class SearchArray {
    public static void main(String[] args) {
        int[] number={1,4,2,6,7};
        int target=7;
        String[] f={"apple","orange","banana"};
        String target2="ban";
        boolean isfound=false;

        for(int i=0;i<f.length;i++)
        {
            if(f[i].equals(target2))
            {
                System.out.println("Number found at index: " + i);
                isfound=true;
                break;
            }
        }
        if(!isfound)
        {
            System.out.println("Element not found in the array");
        }
    }
}
