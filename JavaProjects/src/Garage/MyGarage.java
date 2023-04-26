package Garage; /**
 * Name: Garage.MyGarage
 *
 * Student name: Arrhat Maharjan
 * Student number: 3091663
 */
import java.util.*;
//remember to comment your methods
class MyGarage implements Garage {

    ArrayList<Car> cars;
    public MyGarage() {
        cars = new ArrayList<Car>();
    }

    @Override
    public boolean add(Car c) {
        boolean bool=false;
        if(cars.size()==0){
            //add if no Garage.Car is added initially
            cars.add(c);
            bool=true;
        }else {
            //looping the arraylist with getReg() method for comparison.
            for (int i = 0; i <cars.size(); i++) {
                if (cars.get(i).getReg() == c.getReg()) {
                } else {
                    cars.add(c);
                    bool = true;
                    break; //break if condition is true and car is added
                }
            }
        }
        return bool;
    }

    @Override
    public Car getCar(String reg) {
        //looping the arraylist with getReg() method for comparison.
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getReg()== reg) {
                return (cars.get(i)); //return object
            }
        }
        return null;
    }

    @Override
    public ArrayList<Car> getCarsByMake(String make) {
        ArrayList<Car> makeList= new ArrayList<>(); //new arraylist
        for (int i = 0; i < cars.size(); i++) { //looping the main cars arraylist
            if (cars.get(i).getMake().equalsIgnoreCase(make)) {
                makeList.add(cars.get(i)); //adding objects from cars list to new list
            }
        }
        return makeList; //return the new arraylist
    }

    @Override
    public double totalValue() {
        double buffer=0; //new variable to combine values
        for (int i=0;i<cars.size();i++) {
            buffer= buffer+ cars.get(i).getPrice(); //adding up prices
        }
        return buffer; //returning combined value
    }

    @Override
    public boolean changeOwner(String reg, String owner) {
        boolean valid=false;
        for (int i=0;i<cars.size();i++) {
            if (cars.get(i).getReg()==reg) {
                cars.get(i).setOwner(owner); //calling method setOwner in class Garage.Car
                valid=true;
                break;
            }
        }
        return valid;
    }

    @Override
    public boolean changePrice(String reg, double price) {
        boolean valid=false;
        for (int i=0;i<cars.size();i++) {
            if (cars.get(i).getReg()==reg) {
                cars.get(i).setPrice(price); //calling method setPrice in class Garage.Car
                valid=true;
                break;
            }
        }
        return valid;
    }
    public String toString(Car c){ //toString method to return an object info
        for (int i=0;i<cars.size();i++) {
            if (cars.get(i).equals(c)) { //compare objects as whole
                return("{Owner: "+ cars.get(i).getOwner()+"; "+ "Registration: " +cars.get(i).getReg()+ "; "+ "Make: " +cars.get(i).getMake()+"; "+ "Mileage: " +cars.get(i).getMileage()+ "; " +"Price: "+cars.get(i).getPrice()+"}");
            }
        }
        return null;
    }
}