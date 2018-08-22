package howto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDate {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.WEEK_OF_MONTH,1);
        System.out.println(calendar.getTime());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/YYYY HH:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        Date newDate = simpleDateFormat.parse("05/12/1976 5:22");
        System.out.println(newDate);
    }
}
