//Arrhat Maharjan - 3091663 - 22/10/2022

package StudentManagement;

import java.util.ArrayList;

public class Student extends Module {
    private String name;
    private String address;
    private int id;
    private String program;
    private int year;
    private ArrayList<Module> moduleList;

    Student(String name,String address, int id, String program, int year,String moduleCode, String moduleName,String[] lecList, int hours, String description){ //constructor
        super(moduleCode,moduleName,lecList,hours,description);
        this.name=name;
        this.address=address;
        this.id=id;
        this.program=program;
        this.year=year;
    }
    Student(){} //empty constructor

    //getters and setters for every attribute
    public String getName(){return("Student: " + this.name);}
    public void setName(String name){this.name=name;}
    public String getAddress(){return ("Address: " +this.address);}
    public void setAddress(String address){this.address=address;}
    public int getId(){return this.id;}
    public void setId(int id){this.id=id;}
    public String getProgram(){return this.program;}
    public void setProgram(String program){this.program=program;}
    public int getYear(){return this.year;}
    public void setYear(int year){this.year=year;}
    public ArrayList<Module> getModuleList(){return (this.moduleList);}
    public void setModuleList(){

    }
}
