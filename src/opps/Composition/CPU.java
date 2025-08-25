package opps.Composition;

public class CPU {
    String core;

    CPU(String core){
        this.core=core;
    }

    void show(){
        System.out.println("The CPU processor is "+ this.core);
    }
}
