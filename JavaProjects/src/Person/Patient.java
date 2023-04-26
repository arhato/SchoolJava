package Person;// Name: Arrhat Maharjan
// StudentID: 3091663
// Date: 05/11/2022
// PartOne

public class Patient extends Person {

    private Person pPerson;          //class Person.Person cannot be instantiated
    private int patientId;          //attributes
    private String bloodType;

    Patient( String Name, int phoneNumber, String Gender,int patientId, String bloodType) {
        super(Name,phoneNumber,Gender);
        this.patientId = patientId;
        this.bloodType = bloodType;
    }

    public void abstractMethod() {          //implementing abstract method as per rules
        System.out.println("abstractMethod() for Person.Patient class.");
    }

    public int getPatientId() {
        return this.patientId;           //returns ID
    }

    public String getPatientBloodType() {
        return this.bloodType;           //returns blood type
    }

    public String getPatientName(){
        return super.getName();           //returns name from the method in subclass
    }

    public int getPatientPhoneNumber() {
        return super.getPhoneNumber();    //returns phone number from the method in subclass
    }

    public String getPatientGender() {
        return super.getGender();          //returns gender from the method in subclass
    }

    @Override
    public String toString() {                     //toString() method to return all values of the current instance
        return "Person.Patient{ "+"Name='" + super.getName() + '\'' + //can use super.toString()
                ", phoneNumber=" + super.getPhoneNumber() +   //can use super.toString()
                ", Gender=" + super.getGender() +            //can use super.toString()
                ", patientId=" + patientId +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
