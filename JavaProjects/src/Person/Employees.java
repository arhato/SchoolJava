package Person;// Name: Arrhat Maharjan
// StudentID: 3091663
// Date: 05/11/2022
// PartTwo

import java.util.ArrayList;
import java.util.List;

public class Employees {
    public static void main(String[] args) {
        //declaring collection type of class Person.Employee
        List<Employee> empList = new ArrayList<>();

        //adding 8 instances of class Person.Employee
        empList.add(new Employee("Sarah Susy",68918011,"F",
                234,"Finance"));
        empList.add(new Employee("Damian Darren",7912639,"M",
                123,"Housing"));
        empList.add(new Employee("Adam Lengthy",89934134,"M",
                48,"Finance"));
        empList.add(new Employee("Eve Lengthy",89947210,"F",
                234,"Relations"));
        empList.add(new Employee("Derrick Dusan",34524241,"M",
                75,"Logistics"));
        empList.add(new Employee("Marian Mary",74552345,"F",
                375,"Logistics"));
        empList.add(new Employee("Abigail Marston",31425643,"F",
                25,"Logistics"));
        empList.add(new Employee("Molly O'Shea",867535654,"F",
                98,"Relations"));


        //printing all instances
        for(int i=0;i<empList.size();i++) {
            System.out.println(empList.get(i));
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        //printing Male(M) Person.Employees
        System.out.println("Male Person.Employees");
        for(int i=0;i<empList.size();i++) {
            if (empList.get(i).getEmployeeGender().equalsIgnoreCase("M")){ //calling method to get the value
                System.out.println(empList.get(i));
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        //printing Female(F) Person.Employees
        System.out.println("Female Person.Employees");
        for(int i=0;i<empList.size();i++) {
            if (empList.get(i).getEmployeeGender().equalsIgnoreCase("F")){ //calling method to get the value
                System.out.println(empList.get(i));
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        //printing Person.Employees who work in Logistics
        System.out.println("Logistics Person.Employees");
        for(int i=0;i<empList.size();i++) {
            if (empList.get(i).getEmployeeDepartment().equalsIgnoreCase("logistics")){ //calling method to get the value
                System.out.println(empList.get(i));
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        //printing Person.Employee Molly O'Shea ID 98
        System.out.println("Person.Employee who has ID number: 98");
        for(int i=0;i<empList.size();i++) {
            if (empList.get(i).getEmployeeId()==98){ //calling method to get the value
                System.out.println(empList.get(i));
            }
        }

    }
}
