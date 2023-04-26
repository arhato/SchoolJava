package Person;// Name: Arrhat Maharjan
// StudentID: 3091663
// Date: 05/11/2022
// PartOne

public class Employee extends Person{

    private Person ePerson;       //class Person.Person cannot be instantiated
    private int employeeId;       //attributes
    private String Department;

    Employee(String Name, int phoneNumber, String Gender, int employeeId, String department) { //constructor
        super(Name, phoneNumber, Gender);
        this.employeeId = employeeId;
        this.Department = department;
    }

    public void abstractMethod() {        //implementing abstract method as per rules
        System.out.println("abstractMethod() for Person.Employee class.");
    }

    public int getEmployeeId() {
        return this.employeeId;          //returns ID
    }

    public String getEmployeeDepartment() {
        return this.Department;          //returns department
    }

    public String getEmployeeName(){
        return super.getName();          //returns name from subclass
    }

    public int getEmployeeNumber() {
        return super.getPhoneNumber();   //returns phone number from the method in subclass
    }

    public String getEmployeeGender() {
        return super.getGender();        //returns gender from the method in subclass
    }

    @Override
    public String toString() {                 //toString() method to return all values of the current instance
        return "Person.Employee{ "+"Name='" + super.getName() + '\'' +  //can use super.toString()
                ", phoneNumber=" + super.getPhoneNumber() +    //can use super.toString()
                ", Gender=" + super.getGender() +             //can use super.toString()
                ", employeeId=" + employeeId +
                ", Department='" + Department + '\'' +
                '}';
    }
}
