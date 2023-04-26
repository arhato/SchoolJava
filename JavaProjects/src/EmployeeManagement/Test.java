//Arrhat Maharjan - 3091663 - 22/10/2022

package EmployeeManagement;

public class Test {
    public static void main(String[] args){
        //new instance
        Employee myObj= new Employee("Adam","Bryan","adambryan@home.com","adambryan@work.com");
        //Testing the methods
        System.out.println(myObj.fullName());
        System.out.println(myObj.getEmails());
        System.out.println(myObj.homeEmail());
        System.out.println(myObj.workEmail());
    }
}
                          