package day02;

/**
 * @program: spring_study
 * @ClassName: EmployeeTest
 * @author: skl
 * @create: 2024-08-13 14:04
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker",3000,2018,1,1);
        staff[1] = new Employee("Harry Hacker",4000,2018,1,1);
        staff[2] = new Employee("Tony Tester",5000,2018,1,1);
        for(Employee e : staff){
            e.raiseSalary(5);
        }
        for (Employee e : staff){
            System.out.println("name="+e.getName()+
                    ",salary="+e.getSalary()+
                    ",hireDay="+e.getHireDay());
        }
    }
}
