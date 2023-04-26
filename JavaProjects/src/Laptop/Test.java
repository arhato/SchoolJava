// Arrhat Maharjan - 3091663 - 14/10/2022

package Laptop;

public class Test {

    public static void main(String[]args){

        Laptop dell=new Laptop("Dell","Intel i5 12500H",64,512,1199.9); //instance 1
        Laptop asus=new Laptop("Asus","Ryzen 5 6600",32,1024, 2599.9);  //instance 2

        dell.info(); //display info of instance 1
        asus.info(); //display info of instance 2

        if (dell.getRam()< asus.getRam()){ //compare ram amount
            System.out.println("Asus has more RAM");
            asus.adjustPrice(-100);      //using + or - to adjust price
        }else if(dell.getRam()> asus.getRam()){
            System.out.println("Dell has more RAM");
            dell.adjustPrice(-100);
        }else{
            System.out.println("They have equal amount of RAM");
        }

        dell.info(); //display info of instance 1
        asus.info(); //display info of instance 2
    }
}
