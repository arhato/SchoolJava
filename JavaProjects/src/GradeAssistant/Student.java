package GradeAssistant;

import java.util.Scanner;

class Student {
    private Integer cp, sad, osd, eld;
    private double avg;
    private String name, Id;
    private String file;

    public Student(String name, String Id, int cp, int sad, int osd, int eld, double avg) {
        this.name = name;
        this.Id = Id;
        this.cp = cp;
        this.sad = sad;
        this.osd = osd;
        this.eld = eld;
        this.avg = avg;
    }

    public Student(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.Id;
    }

    public void setMark(String moduleCode, int newMark) {
        if (moduleCode.equalsIgnoreCase("cp")) {
            this.cp = newMark;
        } else if (moduleCode.equalsIgnoreCase("sad")) {
            this.sad = newMark;
        } else if (moduleCode.equalsIgnoreCase("osd")) {
            this.osd = newMark;
        } else if (moduleCode.equalsIgnoreCase("eld")) {
            this.eld = newMark;
        } else {
            System.out.println("sry. modulecode non-exist");
        }

        this.avg = (this.cp + this.sad + this.osd + this.eld) / 4;
    }

    public void display() {
        System.out.println(this.name + " \t" + this.Id + "\t " + this.cp + " \t" + this.sad + "\t " + this.osd + "\t " + this.eld + "\t " + this.avg);
    }

    public void menu() {
        System.out.println("Choose one option. Enter the corresponding number.");
        System.out.println("1. Enter new marks.\n" +
                "2. Add new student\n" +
                "3. Remove student\n" +
                "4. Save changes\n" +
                "5. Exit\n");
        Scanner menuSc = new Scanner(System.in);
        int option = menuSc.nextInt();
        switch (option) {
            case 1:
                newMarks();
                break;
            case 2:
                newStudent();
                break;
            case 3:
                // removeStudent();
                break;
            case 4:
                //saveChange();
                break;
            case 5:
                //exit();
                break;
        }
    }

    public void newMarks() {
        System.out.println("Enter the GradeAssistant.Student ID");
        Scanner markSc = new Scanner(System.in);
        String inputId = markSc.nextLine();
        if (this.Id.equalsIgnoreCase(inputId)) {
            System.out.println(this.name);
            System.out.println("Enter the new marks accordingly. (CP.SAD,OSD,ELD)");
            int buffer = markSc.nextInt();
            setMark("cp", buffer);
            buffer = markSc.nextInt();
            setMark("sad", buffer);
            buffer = markSc.nextInt();
            setMark("osd", buffer);
            buffer = markSc.nextInt();
            setMark("eld", buffer);
        } else {
            System.out.println("GradeAssistant.Student ID not found.");
            menu();
        }
    }

    public void newStudent() {
        System.out.println("Enter the GradeAssistant.Student ID");
        Scanner markSc = new Scanner(System.in);
        String inputId = markSc.nextLine();
        if (this.Id.equalsIgnoreCase(inputId)) {

        } else {
            System.out.println("GradeAssistant.Student ID not found.");
            menu();
        }
    }
    // was not able to do this part(code wouldn't compile unless taken out)


//    public void removeStudent(){
//        System.out.println("Enter the GradeAssistant.Student ID.");
//        Scanner removeSc=new Scanner(System.in);
//        String inputId=removeSc.nextLine();
//        try{
//            if (this.Id.equalsIgnoreCase(inputId){
//                List.remove(this.Id);
//            }
//
//        }catch(Exception e){
//            System.out.println("GradeAssistant.Student not found.");
//        }
//    }
//    public void saveChange(){
//        try{
//            FileWriter fr = new FileWriter(file, false);
//            PrintWriter pw= new PrintWriter(fr);
//            pw.println(List);
//            pw.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//    public void exit(){
//        System.out.println("Have you made any changes?(Y/N)");
//        Scanner exitSc = new Scanner(System.in);
//        String confirm = exitSc.nextLine();
//        if (confirm.equalsIgnoreCase("Y")){
//            saveChange();
//        }else{
//            System.out.println("Exiting.");
//        }
//    }
}
