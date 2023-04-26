package Rational;//Name: Arrhat Maharjan
//Id: 3091663
//Date: 11/11/2022

public class Test {
    public static void main(String[] args) {

        Rational num1=new Rational(4,8);  //instance num1 of Rational.Rational Class
        Rational num2=new Rational(3,5);  //instance num2 of Rational.Rational Class
        Rational num3=new Rational(2);       //instance num3 of Rational.Rational Class using the second method
        Rational num4=new Rational(3,5);  //instance num2 of Rational.Rational Class

        //testing add(), sub(), multiply(), and divide().
        System.out.println(num1.toString() +" + "+num2.toString() + "= "+ num1.add(num2));
        System.out.println(num2.toString() +" - "+num1.toString() + "= "+num2.sub(num1));
        System.out.println(num1.toString() +" * "+num2.toString() + "= "+num1.multiply(num2));
        System.out.println(num1.toString() +" / "+num3.toString() + "= "+num1.divide(num3));
        //toString() is unnecessary
        //just using the object without toString() yields the same result

        //testing multiplyByInt(), divideByInt(), and equals().
        //multiple and divide num1 by 2
        System.out.println(num1.toString() +" * 2" + "= "+ num1.multiplyByInt(2));
        System.out.println(num1.toString() +" / 2" + "= "+ num1.divideByInt(2));
        //checking equals() method functionality
        System.out.println("Is "+ num1 +" and "+num2+" equal?: " + num1.equals(num2));
        System.out.println("Is "+ num2 +" and "+num4+" equal?: " + num2.equals(num4));
    }
}
