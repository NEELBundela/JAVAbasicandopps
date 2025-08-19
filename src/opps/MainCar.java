package opps;



public class MainCar {
    public static void main(String[] args) {

        //car class
       /* Car car=new Car();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
       System.out.println(car.isRunning);

        car.start();
        System.out.println(car.isRunning);*/

        //student class
        /*STUDENT2 std = new STUDENT2("Neel",20,7.8);
        STUDENT2 std2 = new STUDENT2("Pratik",20,8.0);

        System.out.println(std.name);
        System.out.println(std2.name);
        std.study();*/

        CONSTRUCTOROVERLOADED c=new CONSTRUCTOROVERLOADED("NEEL");
        System.out.println(c.name);
        System.out.println(c.email);
        System.out.println(c.age);

        CONSTRUCTOROVERLOADED c1=new CONSTRUCTOROVERLOADED("Neel","Neel@gmail.com");
        System.out.println(c1.name);
        System.out.println(c1.email);
        System.out.println(c1.age);

        CONSTRUCTOROVERLOADED c2=new CONSTRUCTOROVERLOADED("Neel","n@gmail.com",20);
        System.out.println(c2.name);
        System.out.println(c2.email);
        System.out.println(c2.age);

        CONSTRUCTOROVERLOADED c3=new CONSTRUCTOROVERLOADED();
        System.out.println(c3.name);
        System.out.println(c3.email);
        System.out.println(c3.age);
    }
}