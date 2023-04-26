//Arrhat Maharjan - 3091663 - 22/10/2022

package StudentManagement;

public class Module {
    private String moduleCode;
    private String moduleName;
    private String[] lecList;
    private int hours;
    private String description;


    public Module(String moduleCode, String moduleName,String[] lecList, int hours, String description) { //constructor
        this.moduleCode=moduleCode;
        this.moduleName=moduleName;
        this.lecList=lecList;
        this.hours=hours;
        this.description=description;
    }

    Module(){}// empty constructor

    //getters and setters for every attribute
    public String getModuleCode(){return this.moduleCode;}
    public void setModuleCodeCode(String moduleCode){this.moduleCode=moduleCode;}
    public String getModuleName(){return this.moduleName;}
    public void setModuleName(String moduleName){this.moduleName=moduleName;}
    public String[] getLecList(){return this.lecList;}
    public void setLecList(String[] lecList){this.lecList=lecList;}
    public int getHours(){return this.hours;}
    public void setHours(int hours){this.hours=hours;}
    public String getDescription(){return this.description;}
    public void setDescription(String description){this.description=description;}
}

