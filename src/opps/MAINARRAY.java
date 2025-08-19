package opps;

public class MAINARRAY {
    public static void main(String[] args) {
        ARRAYCONS car1=new ARRAYCONS("Mustang","Red");
        ARRAYCONS car2=new ARRAYCONS("Corvette","Blue");
        ARRAYCONS car3=new ARRAYCONS("Charger","Yellow");

      //  ARRAYCONS[] cars=new ARRAYCONS[3];
       // ARRAYCONS[] cars={car1,car2,car3};
        ARRAYCONS[] cars={new ARRAYCONS("Mustang","Red"),
                          new ARRAYCONS("Corvette","Blue"),
                          new ARRAYCONS("Charger","Yellow")};

        for(int i=0;i<cars.length;i++)
        {
            cars[i].drive();
        }
        for(ARRAYCONS car : cars) //for each
        {
            car.drive();
        }
    }
}
