package Garage;

import java.util.ArrayList;

/**
 * Name: Garage.Garage
 *
 * Student name: Arrhat Maharjan
 * Student number: 3091663
 */
// DO NOT EDIT THIS CLASS

interface Garage{
  public boolean add(Car car);
  public Car getCar(String reg);
  public ArrayList<Car> getCarsByMake(String make);
  public double totalValue();
  public boolean changeOwner(String reg, String owner);
  public boolean changePrice(String reg, double price);
}