package opps;

public class CONSTRUCTOROVERLOADED {
    String name;
    String email;
    int age;

    CONSTRUCTOROVERLOADED(){        //Default Constructor
        this.name="Guest";
        this.email="Not provided";
        this.age=0;
    }

    CONSTRUCTOROVERLOADED(String name){
        this.name=name;
        this.email="Not provided";
        this.age=0;
    }
    CONSTRUCTOROVERLOADED(String name,String email){
        this.name=name;
        this.email=email;
        this.age=0;
    }
    CONSTRUCTOROVERLOADED(String name,String email,int age){
        this.name=name;
        this.email=email;
        this.age=25;
    }
}
