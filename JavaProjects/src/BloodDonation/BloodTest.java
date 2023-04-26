package BloodDonation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BloodTest {
    public static void main(String[] args) {
        ArrayList<String[]> donorList = getDonorList();   //set the donorList for local use
        ArrayList<String[]> recpList = getRecpList();       //set the recpList for local use
        ArrayList<String[]> rMatchesNum = new ArrayList<>();  //ArrayList of the recipient with the number of donors they are compatible with
        ArrayList<String[]> dMatchesNum = new ArrayList<>();    //ArrayList of the recipients with the number of donors they are compatible with
        ArrayList<String[]> finalList = new ArrayList<>();      //ArrayList of the recipients with their final donor
        ArrayList<ArrayList<String[]>> recpPotential = new ArrayList<>();  //ArrayList with recipients with all the name of their potential donors
        ArrayList<ArrayList<String[]>> donorPotential = new ArrayList<>(); //ArrayList with donors with all the name of their potential recipients
        System.out.println("Recipient and their potential matches: ");
        int rcounter = 0;      //used to know how many donors the recipient is compatible with
        for (int i = 0; i < recpList.size(); i++) {
            System.out.print(recpList.get(i)[0] + "; " + recpList.get(i)[1]);
            System.out.println();
            ArrayList<String[]> recpBuffer = new ArrayList<>();
            for (int j = 0; j < donorList.size(); j++) {
                if (bloodTypeMatch(donorList.get(j)[1], recpList.get(i)[1])) { // calling the method to complete the logic(true or false)
                    recpBuffer.add(donorList.get(j));    //[Bob, Jan, ....]
                }
            }
            rcounter = recpBuffer.size();
            String[] r = {recpList.get(i)[0], String.valueOf(rcounter)}; // {Dan, 3}
            rMatchesNum.add(r);   //[{Dan,3},{Sam,8}]
            System.out.println(Arrays.toString(r));
            recpPotential.add(i, recpBuffer);   //[ 1,[Bob, Jan, ....] , 2, [Pam,Max,...]]
            System.out.println("They have " + rcounter + " potential donors");
            System.out.println("Compatible donors:");
            for (int k = 0; k < recpPotential.get(i).size(); k++) {
                System.out.print(recpPotential.get(i).get(k)[0] + "; ");   //printing their donors
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Donors and their potential matches: ");
        int dcounter = 0;     //used to know how many  recipients the donor is compatible with
        for (int i = 0; i < donorList.size(); i++) {
            System.out.print(donorList.get(i)[0] + "; " + donorList.get(i)[1]);
            System.out.println();
            ArrayList<String[]> donorBuffer = new ArrayList<>();
            for (int j = 0; j < recpList.size(); j++) {
                if (bloodTypeMatch(donorList.get(i)[1], recpList.get(j)[1])) {   // calling the method to complete the logic(true or false)
                    donorBuffer.add(recpList.get(j)); //[Bob, Jan, ....]
                }
            }
            dcounter = donorBuffer.size();
            String[] d = {donorList.get(i)[0], String.valueOf(dcounter)};  //{Dan, 3}
            dMatchesNum.add(d);   //[{Dan,3},{Sam,8}]
            System.out.println(Arrays.toString(d));
            donorPotential.add(i, donorBuffer);  //[ 1,[Bob, Jan, ....] , 2, [Pam,Max,...]]
            System.out.println("They have " + dcounter + " potential recipients");
            System.out.println("Compatible recipients: ");
            for (int k = 0; k < donorPotential.get(i).size(); k++) {
                System.out.print(donorPotential.get(i).get(k)[0] + "; "); //printing their recipients
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("The recipients matched with the least busy donor: ");
        int minIndex=0;
        for (int i = 0; i < recpList.size(); i++) {

            int num = Integer.parseInt(rMatchesNum.get(i)[1]);  //parse string to integer
            if (num == 1) {
                String[] finalarr = new String[]{recpList.get(i)[0], recpPotential.get(i).get(i)[0]};  //{Jax,Ann}
                finalList.add(finalarr); ///[{Jax,Ann} , {Jay,Jed}]
            } else if (num > 1) {
                ArrayList<Integer> compare = new ArrayList<>();
                for (int j = 0; j < dMatchesNum.size(); j++) {
                    compare.add(Integer.valueOf(dMatchesNum.get(j)[1]));   //new buffer arraylist to help us compare the numbers
                }
                minIndex = compare.indexOf(Collections.min(compare));   //compare the number of potential recipient for the minimum
                String[] finalarr = new String[]{recpList.get(i)[0], dMatchesNum.get(minIndex)[0]}; //{Jax,Ann}
                finalList.add(finalarr);   ///[{Jax,Ann} , {Jay,Jed}]
            } else {
                String[] finalarr = new String[]{recpList.get(i)[0], recpPotential.get(i).get(i)[0]};  //{Jax,Ann}
                finalList.add(finalarr);  ///[{Jax,Ann} , {Jay,Jed}]
            }
            System.out.println(Arrays.toString(finalList.get(i)));
            recpList.remove(i);
                try{       //writing to the file
                    FileWriter fr = new FileWriter("BloodDonation/appointments.txt", true);
                    PrintWriter pw= new PrintWriter(fr);
                    pw.println("-----------------------------------------------------------------");
                    pw.println("Recipient: " + Arrays.toString(new String[]{finalList.get(i)[0]})+"          "+ "BloodType: "+ recpList.get(i)[1]);
                    pw.println("Donor: " + Arrays.toString(new String[]{finalList.get(i)[1]})+"          "+ "BloodType: "+ donorList.get(minIndex)[1]);
                    pw.println("Date: ");
                    pw.println("------------------------------------------------------------------");
                    pw.close();
                }catch(Exception e){   //catch error
                    e.printStackTrace();
                }
            }
        }
        public static boolean bloodTypeMatch(String donorType, String recpType){    //method to compare compatibility from
        boolean[][] bloodTableArray ={
                {true, false, false, false, false, false, false, false},
                {true, true, false, false, false, false, false, false},
                {true, false, true, false, false, false, false, false},
                {true, true, true, true, false, false, false, false},
                {true, false, false, false, true, false, false, false},
                {true, true, false, false, true, true, false, false},
                {true, false, true, false, true, false, true, false},
                {true, true, true, true, true, true, true, true},
        };
        String[] groups={"O-","O+","A-","A+","B-","B+","AB-","AB+"};
        int donorIndex=-1,recpIndex=-1;
        for(int i=0;i<groups.length;i++){
            if (groups[i].equalsIgnoreCase(donorType.trim())) donorIndex=i;     //was for trim just incase
            if (groups[i].equalsIgnoreCase(recpType.trim())) recpIndex=i;
        }
        if(donorIndex==-1 || recpIndex== -1) {
            throw new IllegalArgumentException("Error: Invalid blood type. Enter the blood types again.");
        }else{
            return bloodTableArray[recpIndex][donorIndex];    //returns true/false
        }
    }
    public static ArrayList<String[]> getDonorList(){  //method to get a arrayList of donors with their bloodtype
        ArrayList<String[]> donorList=new ArrayList<>();
        try {
            Scanner donorFile= new Scanner(new FileReader("untitled/donors.txt"));
        while(donorFile.hasNextLine()){
            String[] donorPerson=donorFile.nextLine().split(";");
            donorList.add(donorPerson);
        }

        } catch (Exception e) {                  //catch error
            System.out.println(e.getMessage());
        }
        return donorList;   // returns the arrayList which has an array inside
    }
    public static ArrayList<String[]> getRecpList(){    // method to get an arrayList of recipients with their bloodtype
        ArrayList<String[]> recpList=new ArrayList<>();
        try {
            Scanner recpFile= new Scanner(new FileReader("untitled/recipients.txt"));
            while(recpFile.hasNextLine()){
                String[] recpPerson=recpFile.nextLine().split(";");
                recpList.add(recpPerson);
            }
        } catch (Exception e) {    //catch error
            System.out.println(e.getMessage());
        }
        return recpList;     //returns the arrayList which has an array inside
    }
}
