package opps;

public class ARRAYCONS {
    String name;
    String model;
    ARRAYCONS(String name,String model){
        this.name=name;
        this.model=model;
    }
    void drive(){
        System.out.println("You drive the " + model + " " + name );
    }
}
