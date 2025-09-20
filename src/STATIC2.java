public class STATIC2 {
    static void show(){
        //show2();//Static cannot access or use non-static member or method because it requires an object
        System.out.println("Static method");

    }
    //we know that something which is not static,belongs to an object
    void show2(){
        show();//non-static can access or use static member or method
        System.out.println("Non-Static method");
    }

    public static void main(String[] args) {
        STATIC2 s = new STATIC2();
        STATIC2.show();  //calling static method
        s.show2(); //calling non-static method
       show();
    }
}
