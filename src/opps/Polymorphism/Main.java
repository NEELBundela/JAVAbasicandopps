package opps.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Person p;

        p=new Student();
        p.behave();
        p=new Player();
        p.behave();
    }
}
