//Arrhat Maharjan - 3091663 - 22/10/2022

package StudentManagement;

public class Test {
    public static void main(String[] args){
        //instance 1
        Student student1= new Student("John Johnson","1 Cork City",12345,"BSCH",2,"CP","Computer Science",new String[]{"jamie", "Jackson"},9,"Computer Science Study");
        //instance 2
        Student student2= new Student("Fernando Fernández","1 Dublin City",54321,"BBA",1,"PS","Probability and Statistics",new String[]{"Jerry", "Michelle"},12,"Prob and Stats");

        //student2.setModuleList("IA","Investment Analysis",new String[]{"carrick", "micheal"},10,"Proper Investment");
        //student2.setModuleList("DA","Data Analysis",new String[]{"Derrick", "Joan"},10,"Analyse market");

        //Output Display
        System.out.println( student1.getName()+", ID: "+student1.getId()+", " +student1.getProgram()+", Year: " +student1.getYear());
        System.out.println("enrolled in: " + student1.getProgram());

        System.out.println(student2.getModuleList());

        System.out.println( student2.getName()+", ID: "+student2.getId()+", " +student2.getProgram()+", Year: " +student2.getYear());
        System.out.println("enrolled in: " + student2.getProgram());
        System.out.println(student2.getModuleList());
    }
}
