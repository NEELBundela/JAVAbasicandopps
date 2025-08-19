package opps;

public class STATIC {
    String name;
    static int numoff;      //Makes a variable or method belong to the
                            //class rather than to any specific object.
    STATIC(String name){
        this.name=name;
        numoff++;
    }
    static void showfriend(){
        System.out.println("you have " + numoff);
    }

    public static void main(String[] args) {
        STATIC friend=new STATIC("Neel");
        STATIC friend2=new STATIC("Namra");
        //System.out.println(friend.name);

        System.out.println(STATIC.numoff);
        //System.out.println(friend.numoff);

        STATIC.showfriend();
    }
}
