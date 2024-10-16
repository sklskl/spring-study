package day04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program: spring_study
 * @ClassName: TestDate
 * @author: skl
 * @create: 2024-09-12 11:42
 */
public class TestDate {
    public static void main(String[] args) {

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        Date date = gregorianCalendar.getTime();
        gregorianCalendar.setTime(date);
        int year = gregorianCalendar.get(GregorianCalendar.YEAR);
        int month = gregorianCalendar.get(GregorianCalendar.MONTH);
        int day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        GregorianCalendar d = new GregorianCalendar();
        d.set(Calendar.DAY_OF_MONTH,1);
        int week = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(gregorianCalendar);
    }
}
