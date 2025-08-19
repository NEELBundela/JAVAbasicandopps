package basic;

public class TernaryOperator {
    public static void main(String[] args) {
        //it returns 1 of 2 values if a condition is true

        //variables=(condition) ? ifTrue : ifFalse

        int s=70;

        String  passOrFail=(s>=60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

        int n=4;
        String check=(n%2==0) ? "Even" : "ODD";

        System.out.println(check);



    }
}
