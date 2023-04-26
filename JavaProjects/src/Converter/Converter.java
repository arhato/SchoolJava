package Converter;/*
 * Assignment 08
 *
 * Student name: Arrhat Maharjan
 * Student number: 3091663
 * Date: 3/12/2022
 */

public class Converter {
    //static variables for constant values
    private static final double distConstant=1.609;
    private static final int tempConstant=32;

    public static double fahrenheitToCelsius(Double f){
        //return value according to the formula
        return((f-tempConstant)*5.0/9.0);
    }
    public static double celsiusToFahrenheit(Double c){
        //return value according to the formula
        return((c*9.0/5.0)+tempConstant);
    }
    public static double mileToKilos(Double m){
        if(m<=0){
            //throw exception if the distance in <=0 / invalid
            throw new IllegalArgumentException();
        }
        //return value according to the formula
        return(distConstant*m);
    }
    public static double kiloToMiles(Double k){
        if(k<=0){
            //throw exception if the distance in <=0 / invalid
            throw new IllegalArgumentException();
        }
        //return value according to the formula
        return(k/distConstant);
    }

}
