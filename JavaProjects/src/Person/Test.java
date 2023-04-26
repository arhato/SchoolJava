package Person;// Name: Arrhat Maharjan
// StudentID: 3091663
// Date: 05/11/2022
// PartOne

public class Test {
    public static void main(String[] args){

        //creating objects
        Patient Patient1=new Patient("Adam Lengthy",89934134,"Male",
                4896,"AB+");    //instance Patient1 for class Person.Patient
        Employee Employee1=new Employee("Eve Lengthy",89947210,"Female",
                234,"Anesthetics");   //instance Employee1 for class Person.Employee

        //Testing all the method of class Person.Patient
        Patient1.abstractMethod();
        System.out.println(Patient1.getPatientName());
        System.out.println(Patient1.getPatientPhoneNumber());
        System.out.println(Patient1.getPatientGender());
        System.out.println(Patient1.getPatientId());
        System.out.println(Patient1.getPatientBloodType());
        System.out.println(Patient1.toString());
        System.out.println();

        //Testing all the method of class Person.Employee
        Employee1.abstractMethod();
        System.out.println(Employee1.getEmployeeName());
        System.out.println(Employee1.getEmployeeNumber());
        System.out.println(Employee1.getEmployeeGender());
        System.out.println(Employee1.getEmployeeId());
        System.out.println(Employee1.getEmployeeDepartment());
        System.out.println(Employee1.toString());
    }
}
