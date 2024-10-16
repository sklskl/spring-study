package day05;

import java.util.Date;

/**
 * @program: spring_study
 * @ClassName: EmployeeTest
 * @author: skl
 * @create: 2024-09-12 15:45
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Jone",5000,new Date(2000,10,1));
        employees[1] = new Employee("Mike",6000,new Date(2001,10,1));
        employees[2] = new Employee("Lucy",7000,new Date(2002,10,1));
        for (Employee employee : employees) {
            if (employee != null) { // 检查 employee 是否为 null
                employee.raiseSalary(5.0);
                System.out.println("Salary:" + employee.getSalary() + ", Name:" + employee.getName() + ", HireDay:" + employee.getHireDay());
            } else {
                System.out.println("发现了一个 null 值的员工对象");
            }}
        Employee e = new Employee();

        Employee e1= new Employee("aaa",2000,new Date(1999,10,1));
        Employee e2 = new Employee("bbb",3000,new Date(1999,10,2));
        e.swap(e1,e2);
    }

}
