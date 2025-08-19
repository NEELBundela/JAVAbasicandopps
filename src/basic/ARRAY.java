package basic;

public class ARRAY {
    public static void main(String[] args) {
       /* String[] fruits={"Apple","Bananan"};// 1st methods
        String[] foods=new String[3];//2nd methods
        foods[0]="pizza";

        System.out.println(foods[0]);
        for(int i=0;i< fruits.length;i++){
            System.out.println(fruits[i]);
        }
        for(String fruit : fruits){    //for each loop
            System.out.println(fruit);
        }*/
        int[] number={1,2,3,6,2};
        int sum=0;

        for(int i=0;i<number.length;i++)
        {
            sum+=number[i];
        }
        System.out.println(sum);
    }
}
