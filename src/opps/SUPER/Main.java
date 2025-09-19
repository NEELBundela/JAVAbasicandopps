package opps.SUPER;

public class Main {
    public static void main(String[] args) {
        //super = it's reference variables,that refers to parent class object

        Person person = new Person("Neel", "Bundela");
        Student s=new Student("Namra","Patel",8.5);
        Employee em=new Employee("Neel","Bundela",50000);
        person.showName();
        s.showgpa();
        em.showSalary();
    }
}