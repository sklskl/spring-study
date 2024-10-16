package day02;

import lombok.Data;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program: spring_study
 * @ClassName: Employee
 * @author: skl
 * @create: 2024-08-13 13:59
 */
@Data
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public void raiseSalary(double byPercent) {
        salary += salary * byPercent / 100;
//        System.out.println(salary);
    }
}
