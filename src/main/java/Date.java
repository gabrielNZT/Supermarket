import java.util.Calendar;
import java.util.Scanner;

public class Date {

    static public java.util.Date getAtualDate(){
        Calendar actualDate = Calendar.getInstance();
        return actualDate.getTime();
    }

}
