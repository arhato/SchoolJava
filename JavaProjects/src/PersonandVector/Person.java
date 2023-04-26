package PersonandVector;/*Name: Arrhat Maharjan
 * Student Id: 3091663
 * Date: 25/11/2022
 */

import java.util.Objects;

final class Person implements Comparable<Person> {
    //attributes
    private final String prsi;
    private final String name;
    private final String dateOfBirth;

    //constructor
    Person(String prsi, String name, String dateOfBirth) {
        this.prsi = prsi;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    //getters
    public String getPrsi(){return prsi;}
    public String getName(){return name;}
    public String getDateOfBirth(){return dateOfBirth;}

    //equals() method
    public boolean equals(Person p){
        if (p==null){ //checking null
            return false;
        }else{
            //comparing the prsi of both the objects
            return Objects.equals(this.prsi, p.getPrsi());
        }
    }
    @Override
    //compareTo() method
    public int compareTo(Person p){
            //comparing if the prsi of both the objects are equals
        if(Objects.equals(this.prsi, p.getPrsi())){
            return 0; //return 0 if true
        }else{
            //comparing order, return integer <1, =0 or >1
         return this.prsi.compareToIgnoreCase(p.getPrsi()); //comparing order, return integer <1, =0 or >1
        }
    }
    //toString() method
    @Override
    public String toString(){
        //returning all info of the object
        return("{PRSI Number: " + this.prsi +"; Name: " + this.name + "; BirthDate: " + this.dateOfBirth + "}");
    }
    //hashCode() method
    @Override
    public int hashCode(){
        //returning hashcode from the prsi number
        return Objects.hash(this.prsi);
    }
}
