package HashMap;

/**
 * student name: Arrhat Maharjan
 * student number: 3091663
 */

public class Point3D {
    private int x, y, z;

    Point3D(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public int z() {
        return z;
    }

    //equals method
    @Override
    public boolean equals(Object o) {
        //if its the same instance return true
        if (this == o) return true;
        //if parameter is null or is a object of a different class
        //return false
        if (o == null || getClass() != o.getClass()) return false;
        //cast parameter to Point3D Object
        Point3D point3D = (Point3D) o;
        //check all variables and return boolean
        if (x != point3D.x) return false;
        if (y != point3D.y) return false;
        return z == point3D.z;
    }

    //hashcode method
    @Override
    public int hashCode() {
        //initialize with x
        int result = x;
        //add variable y with operations
        result = 31 * result + y;
        //add variable z with operations
        result = 31 * result + z;
        //return result
        return result;
    }

    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

}