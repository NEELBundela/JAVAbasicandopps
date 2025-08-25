package opps.Composition;

public class Main {
    public static void main(String[] args) {

       // Composition = ite represents a "Part-of" relationship between objects

        Computer computer = new Computer("HP",70000,"i5");
        //System.out.println(computer.cpu.core);
        computer.show();

    }
}
