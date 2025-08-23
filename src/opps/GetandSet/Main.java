package opps.GetandSet;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Nevil",22,1);
       // emp.name; //cannot access private attribute like this

        emp.setage(23);//modify private attribute using setter method
        emp.setEmpid(2);
        System.out.println("Employee name is "+ emp.getName() +
                            " age is " + emp.getage() +
                            " he's id is " + emp.getEmpid());
    }
}
