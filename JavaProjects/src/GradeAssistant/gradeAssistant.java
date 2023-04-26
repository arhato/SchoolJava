package GradeAssistant;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class gradeAssistant {
    public static void main(String[] args){
        ArrayList<Student> List=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the file.(BSCH.csv)");
        String file=sc.nextLine();
        try {
            Scanner filesc=new Scanner(new FileReader(file));
            filesc.nextLine();
            while(filesc.hasNextLine()){
                String[] stuArr=filesc.nextLine().split(",");
                String stuName = stuArr[0].trim();
                String stuId = stuArr[1].trim();
                int cpMark=Integer.parseInt(stuArr[2].trim());
                int sadMark=Integer.parseInt(stuArr[3].trim());
                int osdMark=Integer.parseInt(stuArr[4].trim());
                int eldMark=Integer.parseInt(stuArr[5].trim());
                int avgMark=Integer.parseInt(stuArr[6].trim());
                Student s= new Student(stuName,stuId,cpMark,sadMark,osdMark,eldMark,avgMark);
                List.add(s);
            }
            for (Student s: List) {
                s.display();
                s.menu();
            }
        }
        catch(Exception e){
            System.out.println("Error. File not found.");
            System.exit(0);
        }
    }
}
