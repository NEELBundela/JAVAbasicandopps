package opps;

public class WrapperClass {
    public static void main(String[] args) {

        //Wrapper class=allow primitives values to be used as object.

        //Autoboxing
        Integer a = 123;
        Double b = 3.22;

        //unBoxing
        int x = a;
        double y = b;
        //Convert primitive values into String
        String c = Integer.toString(123);
        String d = Double.toString(2.44);

        String dd = c + d;
        System.out.println(dd);

        //Convert String values into primitives
        int e = Integer.parseInt("123");
        char f = "Neel".charAt(0);

        System.out.println(e);
        System.out.println(f);
    }
}
