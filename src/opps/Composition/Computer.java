package opps.Composition;

public class Computer {
    String name;
    int price;
   CPU cpu;

    Computer(String name,int price,String intelcore)
    {
        this.name=name;
        this.price=price;
        this.cpu=new CPU(intelcore);
    }

    void show()
    {
        this.cpu.show();
        System.out.println("The Computer Model is " + this.name + " " + "Price is " + this.price);
    }
}
