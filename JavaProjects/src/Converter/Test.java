package Converter;/*
 * Assignment 08
 *
 * Student name: Arrhat Maharjan
 * Student number: 3091663
 * Date: 3/12/2022
 */
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//Q1 Friends.Test =====================================
		//initializing parameters to pass to the methods
		double km=1.0;
		double mile=3.8;
		double cel=24.2;
		double fah=72;
		//testing all four methods
		double miles= Converter.kiloToMiles(1.0);
		double kms= Converter.mileToKilos(3.8);
		double celcius= Converter.celsiusToFahrenheit(cel);
		double fahrenheit= Converter.fahrenheitToCelsius(fah);
		//printing the results
		System.out.println(km+" km is " + miles +" in miles");
		System.out.println(mile+" miles is " + kms +" in kilometres");
		System.out.println(cel+" km is " + celcius +" in fahrenheit");
		System.out.println(fah+" miles is " + fahrenheit +" in celcius");
		//error checking by passing km in negative value
		try{   //try passing negative distance
			double km2=-1;
			double miles2=  Converter.mileToKilos(km2);
			System.out.println(km2+" km is " + miles2 +" in miles");
		}catch (IllegalArgumentException e){ //catch thrown exception
			System.out.println("Incompatible parameter passed!!!!");
		}
		// Q1 end ======================================

		// Q2 Friends.Test ======================================
		//Friends.Test array
		Module[] mlst = {
			new Module("Programming","Donal",36),
			new Module("Networks","Faheem",36),
			new Module("Graphics","Barry",36),
			new Module("Web","Ruairi",36),
			new Module("Hardware","Paddy",36),
			new Module("Algorithms","Eoin",36),
			new Module("OOP","Tony",36),
			new Module("Maths","Paddy",36),
			new Module("BigData","Osama",36)
		};
		//printing initial array
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(mlst));
		//printing after using Arrays.sort() function
		System.out.println("After sorting using Arrays.sort");
		Arrays.sort(mlst);
		System.out.println(Arrays.toString(mlst));
		//printing after sorting with lectCompare() method
		System.out.println("After sorting with lectCompare");
		Arrays.sort(mlst, Module.lectCompare);
		System.out.println(Arrays.toString(mlst));
		//testing compareTo() method consistency with equals() method
		System.out.println(mlst[1].equals(mlst[2])); //false
		System.out.println(mlst[1].compareTo(mlst[2]));  // !0
		System.out.println(mlst[1].equals(mlst[1]));     //true
		System.out.println(mlst[1].compareTo(mlst[1]));	//=0
		// Q2 end =======================================
	}
}
