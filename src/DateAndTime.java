//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
      /*  LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDateTime =datetime.format(formatter);

        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
        System.out.println(newDateTime);*/

        LocalDateTime t1 = LocalDateTime.of(2023,1,14,0,0,0);
        LocalDateTime t2 = LocalDateTime.of(2023,1,14,0,0,0);

        if(t1.isBefore(t2))
        {
            System.out.println(t1 + " is earlier than " + t2);
        }else if(t1.isAfter(t2)){
            System.out.println(t1 + " is later than " + t2);

        } else if (t1.isEqual(t2)) {
            System.out.println(t1 + " is equal to " + t2);
        }
    }
}
