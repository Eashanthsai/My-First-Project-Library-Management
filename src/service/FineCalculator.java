package service;
import java.time.LocalDate;

public class FineCalculator {

    public int calculateFine(LocalDate due,LocalDate returned){

        if(returned.isAfter(due)){

            int days = returned.getDayOfMonth() - due.getDayOfMonth();

            return days*10;

        }
        
        return 0;

    }

}
