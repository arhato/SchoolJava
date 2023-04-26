package PersonandVector;/*Name: Arrhat Maharjan
 * Student Id: 3091663
 * Date: 25/11/2022
 */

import java.util.Objects;

final class Vector implements Comparable<Vector>{

    private final double a, b; //attributes

    Vector(double a, double b){ //constructor
        this.a = a;
        this.b = b;
    }
    //getters
    public double getA(){return a;}
    public double getB(){return b;}
    //toString() method
    @Override
    public String toString() {
        //simple info return
        return ("{Head: " + a +"; Tail: " + b +"}");
    }
    //compareTo() method
    @Override
    public int compareTo(Vector v) {
        if(this.a==v.getA()){ //check of the a s are equals
            return (int) (this.b-v.getB()); //return the difference in b
        } else{ //if the a s are not equals
            return (int)(this.a-v.getA()); //return the difference in b
        }
    }
    //equals() method
    public boolean equals(Vector v) {
        if (v == null) { //check of the incoming instance is empty
            return false;
        } else {
            //compare both a and b from two instances for answer
            return (Double.compare(this.a,v.getA()) == 0 && Double.compare(this.b,v.getB()) == 0);
        }
    }
    //hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}