// Arrhat Maharjan - 3091663 - 14/10/2022

package Laptop;

public class Laptop {

    //attributes
    private String make;
    private String process;
    private int ram;
    private int drive;
    private double price;

    //constructor for the attributes
    public Laptop(String make, String process,int ram, int drive, double price){
        this.make=make;
        this.process=process;
        this.ram=ram;
        this.drive=drive;
        this.price=price;
    }

    //method to display all info
    public void info(){
        System.out.println("Make: " + this.make + ", " + "Processor: " + this.process + ", " + "RAM: " + this.ram + " GB" + ", " + "Hard Drive: " + this.drive + " GB" + ", " + "Price: " + this.price);
    }

    //method to return amount of ram
    public int getRam(){
        return this.ram;
    }

    //method to increase or decrease price
    public void adjustPrice(double update){
        this.price=this.price+update;
    }
}
