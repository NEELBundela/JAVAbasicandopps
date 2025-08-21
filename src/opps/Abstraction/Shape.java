package opps.Abstraction;

public abstract class Shape {
   abstract double area(); //ABSTRACT METHOD it implement in child class

    void display(){
        System.out.println("This is a shape"); //CONCRETE Method define inheritance with
                                                //Abstract class
    }
}
