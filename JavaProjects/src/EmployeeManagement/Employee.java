//Arrhat Maharjan - 3091663 - 22/10/2022

package EmployeeManagement;

public class Employee {
     private  String surname;
     private  String  firstName;
     private  Email emailAddress;

     Employee(String surname, String firstName, String home, String work){ //constructor
          this.surname=surname;
          this.firstName=firstName;
          emailAddress=new Email(home,work);
     }
     public String fullName(){
          return(this.firstName + " " + this.surname);
     } // method to return name

     public String getEmails(){ //method to return both emails
          return("You can find " + this.firstName + " " + this.surname + " at " + emailAddress.getHome() + " and " + emailAddress.getWork());
     }
     public String workEmail(){ // method to return work email
          return("You can find " + this.firstName + " " + this.surname + " at their work address " + emailAddress.getWork());
     }
     public String homeEmail(){ //method to return home email
          return ("You can find " + this.firstName + " " + this.surname + " at their home address " + emailAddress.getHome());
     }
}
