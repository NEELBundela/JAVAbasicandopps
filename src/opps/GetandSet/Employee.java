package opps.GetandSet;

public class Employee {
    private final String name;
    private int age;
    private int Empid;

    Employee(String name,int age,int Empid){
        this.name=name;
        this.age=age;
        this.Empid=Empid;
    }

    String getName(){
        return this.name;
    }

   int getage(){
        return this.age;
    }
   int getEmpid(){
        return this.Empid;
    }




    void setage(int age){
        this.age=age;
    }

    void setEmpid(int Empid){
        this.Empid=Empid;
    }
}
