package day05;

import lombok.Data;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program: spring_study
 * @ClassName: Employee
 * @author: skl
 * @create: 2024-09-12 15:40
 */
@Data
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, Date hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
        GregorianCalendar gc = new GregorianCalendar();
    }

    public Employee() {
    }

    public void raiseSalary(double byPercent){
        salary += salary*byPercent/100;
    }
    public  static  void swap(Employee x,Employee y){
        Employee temp = x;
        x = y;
        y = temp;
    }


//    Employee e1= new Employee("aaa",2000,new Date(1999,10,1));
//    Employee e2 = new Employee("bbb",3000,new Date(1999,10,2));
//    swap(e1,e2);
}
