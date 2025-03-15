package API;
// very efecncly used in java version 1.8
// new key word not used 
//used a now in date  all are inbuilt methode 
import java.time.*;
public class api_2
{
    public static void main(String[] args) 
    {
        //Date
         LocalDate date=LocalDate.now();
         System.out.println(date);
         int day= date.getDayOfMonth();
         int month=date.getMonthValue();
         int year=date.getYear();

       System.out.println(day+ "/" + month + "/" + year);


        //time
         LocalTime time=LocalTime.now();
         System.out.println(time);
         int hour=time.getHour();
         int min=time.getMinute();
         int sec=time.getSecond();
         int nano=time.getNano();

         System.out.println(hour + ":" + min + ":" + sec + ":" +nano);
        

        
    }

}
    

