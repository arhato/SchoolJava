package Garage;

/**
 * Name: Garage.MyCar
 *
 * Student name: Arrhat Maharjan
 * Student number: 3091663
 */
final class MyCar
{
    final private String owner;
    final private String reg;
    final private String make;
    final private int mileage;
    final private double price;

    public MyCar (String owner, String reg, String make, int mileage, double price)
    {
        this.owner = owner;
        this.reg = reg;
        this.make = make;
        this.mileage = mileage;
        this.price = price;
    }

    public String getOwner(){
        return this.owner;
    }

    public String getReg(){
        return this.reg;
    }

    public String getMake(){
        return this.make;
    }

    public int getMileage(){
        return this.mileage;
    }

    public double price(){
        return this.price;
    }

}