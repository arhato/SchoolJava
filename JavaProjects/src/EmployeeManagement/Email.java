//Arrhat Maharjan - 3091663 - 22/10/2022

package EmployeeManagement;

public class Email {
    private String home;
    private String work;

    Email(String home, String work){ //constructor
        this.home=home;
        this.work=work;
    }
    public void setHome(String home){this.home=home;} //setter for home email
    public void setWork(String work){
        this.work=work;
    }  //setter for work email
    public String getHome(){
        return this.home;
    } //getter for home email
    public String getWork(){
        return this.work;
    } //getter for work email
}
