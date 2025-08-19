package opps;

public class Animal extends Orgnism {

    void eat(){
        System.out.println("The Animal is eating");
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        Plant plant=new Plant();

        plant.photo();


        System.out.println(dog.isalive);
        System.out.println(cat.isalive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();
    }
}
