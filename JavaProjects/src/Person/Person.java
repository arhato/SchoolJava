package Person;// Name: Arrhat Maharjan
// StudentID: 3091663
// Date: 05/11/2022
// PartOne

abstract public class Person {
    private String Name;      //attributes
    private int phoneNumber;
    private String Gender;
    
    Person(String Name, int phoneNumber, String Gender) {   //constructor
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.Gender = Gender;
    }

    abstract public void abstractMethod();   //1 abstract method as per the rule

    public String getName() {
        return Name;            //returns variable name
    }

    public int getPhoneNumber() {
        return phoneNumber;     //returns variable phoneNumber
    }

    public String getGender() {
        return Gender;          //returns variable Gender
    }

    @Override
    public String toString() {    //toString() method to return all values of the current instance
        return "Person.Person{" +
                "Name='" + Name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", Gender=" + Gender +
                '}';
    }
}
