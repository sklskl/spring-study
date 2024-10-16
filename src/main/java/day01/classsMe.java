package day01;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @program: spring_study
 * @ClassName: classsMe
 * @author: skl
 * @create: 2024-08-13 13:21
 */
public class classsMe {
    public static void main(String[] args) {

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = gregorianCalendar.get(GregorianCalendar.YEAR);
        int month = gregorianCalendar.get(GregorianCalendar.MONTH);
        int today = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        gregorianCalendar.set(Calendar.DAY_OF_MONTH,1);
        int weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
        int firstDayOfWeek = gregorianCalendar.getFirstDayOfWeek();
        int indent=0;
        while (weekday!=firstDayOfWeek){
            indent++;
            gregorianCalendar.add(Calendar.DAY_OF_MONTH,-1);
            weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
        }

    }
}
