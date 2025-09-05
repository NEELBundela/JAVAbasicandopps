package opps.Generics;



public class Main {
    public static void main(String[] args) {
       Player<String> p1 = new Player<>();
       p1.setItem("Dhoni");
        System.out.println(p1.getItem());

        Player<Integer> p2 =new Player<>();
        p2.setItem(91);
        System.out.println(p2.getItem());

        Product<String ,Integer> pr = new Product<>("Shoes",2000);
        System.out.println(pr.getItem());
        System.out.println(pr.getPrice());
    }
}
