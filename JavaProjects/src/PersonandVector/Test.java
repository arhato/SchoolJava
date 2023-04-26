package PersonandVector;/*Name: Arrhat Maharjan
* Student Id: 3091663
* Date: 25/11/2022
*/

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //TESTING PERSON CLASS
        //--------------------------------------------------------------------------
        //creating two objects with same prsi
        Person p1=new Person("aaa12","Adam","10/1/2000");
        Person p2=new Person("aaa12","Millie","15/8/2001");
        //creating 5 more with different prsi
        Person p3=new Person("haj45","Darren","12/2/1998");
        Person p4=new Person("vdo21","Christian","1/1/1999");
        Person p5=new Person("nsm87","Tyler","25/6/2004");
        Person p6=new Person("ejn22","Hayley","16/2/1997");
        Person p7=new Person("dfk23","John","22/7/200");
        //testing equals() method
        System.out.println("Does "+p1.getName()+" and "+p2.getName()+" have the same PRSI Number?: "+p1.equals(p2)); //true
        System.out.println("Does "+p1.getName()+" and "+p3.getName()+" have the same PRSI Number?: "+p1.equals(p3)); //false
        //testing hashCode() method
        //stays consistent on multiple calls
        System.out.println(p1.toString()+"'s hashcode is: "+p1.hashCode());
        System.out.println(p1.toString()+"'s hashcode is: "+p1.hashCode());
        System.out.println(p3.toString()+"'s hashcode is: "+p3.hashCode());
        System.out.println(p3.toString()+"'s hashcode is: "+p3.hashCode());
        //comparing hashCode, should be true since p1 and p2 have the same prsi
        System.out.println("Does "+p1.getName()+" and "+p2.getName()+" have the same hashcode?: "+(p1.hashCode()==p2.hashCode()));
        //testing compareTo() method
        System.out.println(p1.compareTo(p2)); //prints 0
        System.out.println(p3.compareTo(p1)); //prints int >0, since "haj45" comes after "aaa12"
        //testing toString() method
        System.out.println(p1.getName()+"'s information: "+ p1.toString());
        System.out.println(p3.getName()+"'s information: "+p3.toString());
        //initialising array with 6 objects
        Person[] array={p3,p4,p5,p6,p7,p2};
        //printing the array
        System.out.println("Before sorting: " + Arrays.toString(array));
        //use Arrays.sort() method
        Arrays.sort(array);
        //printing array again
        System.out.println("After sorting: " + Arrays.toString(array));

        //TESTING VECTOR CLASS
        //--------------------------------------------------------------------------
        System.out.println("Testing PersonandVector.Vector class");
        System.out.println("-----------------------------------------------------------");
        //5 instances of class PersonandVector.Vector
        Vector v1=new Vector(2.0,3.0);
        Vector v2=new Vector(2.0,3.0);
        Vector v3=new Vector(2.0,5.0);
        Vector v4=new Vector(6.0,3.0);
        Vector v5=new Vector(1.0,9.0);
        //testing equals() and toString() methods
        System.out.println("Is "+v1.toString()+" equal to "+v2.toString()+"?: "+ v1.equals(v2));
        System.out.println("Is "+v1.toString()+" equal to "+v3.toString()+"?: "+ v1.equals(v3));
        System.out.println("Is "+v1.toString()+" equal to "+v4.toString()+"?: "+ v1.equals(v4));
        //testing hashCode() method
        System.out.println(v1.toString()+"'s hashcode is: "+ v1.hashCode());
        //v2 has the same hashcode as v1 as they are equals
        System.out.println(v2.toString()+"'s hashcode is: "+ v2.hashCode());
        //hashcode stays consistent on multiple calls
        System.out.println(v1.toString()+"'s hashcode is: "+ v1.hashCode());
        System.out.println(v5.toString()+"'s hashcode is: "+ v5.hashCode());
        //testing compareTo() method
        System.out.println("The difference between "+v1.toString()+" and "+v2.toString()+" is:" +v1.compareTo(v2));
        System.out.println("The difference between "+v1.toString()+" and "+v3.toString()+" is:" +v1.compareTo(v3));
        System.out.println("The difference between "+v4.toString()+" and "+v5.toString()+" is:" +v4.compareTo(v5));
    }
}
