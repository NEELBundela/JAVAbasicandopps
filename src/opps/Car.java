package opps;

public class Car {
    String make="Porsche";
    String  model="Maruti";
    int year=2025;
    double price=50000.99;
    boolean isRunning=false;

    void start(){
        isRunning=true;
        System.out.println("You start the engine");
    }
}
