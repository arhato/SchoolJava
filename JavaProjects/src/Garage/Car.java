package Garage; /**
 * Name: Garage.Car
 *
 * Student name:
 * Student number:
 */
// DO NOT EDIT THIS CLASS
import java.util.*;
class Car{
	private String owner;
	private String reg;
	private String make;
	private int mileage;
	private double price;
	public Car(String owner, String reg, String make, int mileage, double price){
		this.owner = owner;
		this.reg = reg;
		this.make = make;
		this.mileage = mileage;
		this.price = price;
	}

	public String getOwner(){
		return owner;
	}

	public String getReg(){
		return reg;
	}

	public String getMake(){
		return make;
	}

	public int getMileage(){
		return mileage;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public void setOwner(String owner){
		this.owner = owner;
	}

	public void setMileage(int mileage){
		this.mileage = mileage;
	}

	public void setMake(String make){
		this.make = make;
	}
}