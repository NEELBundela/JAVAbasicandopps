package basic;



public class MethodsofString {
    public static void main(String[] args) {


        String name = "Neel";

        int length = name.length();
        char letter=name.charAt(0);//display the 0th position letter
        int index=name.indexOf("e");//it display starting position
        int lastindex=name.lastIndexOf("e");//it display last

        //name=name.toUpperCase();
        //name=name.trim();//reduce the space
        //name=name.replace("e","i");//replace e to i
       // boolean a=name.isEmpty();//check that string is empty or not
        //System.out.println(a);

       /* if(name.contains(" ")){
            System.out.println("your name contain a space");
        }else {
            System.out.println("Your name doesn't contain a space");
        }
        if(name.equals("neel")){//this method is case sensetive use equalsIgnoreCase
            System.out.println("your name can't be neel");
        }else {
            System.out.println("Heloo " + name);
        }*/

    }
}
