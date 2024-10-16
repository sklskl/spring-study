package day05;

import java.util.Random;

/**
 * @program: spring_study
 * @ClassName: randomTest
 * @author: skl
 * @create: 2024-09-23 14:15
 */
public class randomTest {
    public void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 50000);
        staff[1] = new Employee(50000);
        staff[2] = new Employee();
        for(Employee e : staff){
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }

    }

    class Employee{
        private static int nextId;
        private int id;
        private String name = "";
        private double salary;
        static {
            Random generator = new Random();
            nextId = generator.nextInt();
        }
        {
            id = nextId;
            nextId++;
        }

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        public Employee(double s){
            this("Employee #" + nextId, s);
        }

        public Employee() {
        }

        public static int getNextId() {
            return nextId;
        }

        public static void setNextId(int nextId) {
            Employee.nextId = nextId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
}
