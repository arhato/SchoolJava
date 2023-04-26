package Garage; /**
 * Name: Garage.Friends.Test
 *
 * Student name: Arrhat Maharjan
 * Student number: 3091663
 */

public class Test{
	public static void main(String[] args){
	  //Q1 Testing ===================================
		// Garage.Friends.Test your Garage.MyCar class
	  	//==============================================
		//new instance created
	  MyCar newCar=new MyCar("Adam","DL408","Honda",20,4000);
	  //printing all the info while calling the get methods
		System.out.println("Owner: "+ newCar.getOwner()+"; Registration: "+ newCar.getReg()+"; Make: " + newCar.getMake()
				+"; Mileage(per litre): "+ newCar.getMileage()+ "; Price: " +newCar.price());
	  	//since we do not have setter methods we cannot change any of the value unless we created a new instance

	  //Q2 Testing ===================================
		// Garage.Friends.Test each method call in Garage.MyGarage
	  //=============================================
		System.out.println("==========================================================================================");
		//creating 7 instances of class Garage.Car
		Car car1=new Car("Adam","DL408","Honda",40,4000);
		Car car2=new Car("Eve","CO141","Suzuki",30,5000);
		Car car3=new Car("Brian","OA123","Ford",20,8000);
		Car car4=new Car("Charlotte","DG543","Ford",25,5000);
		Car car5=new Car("Damian","VD454","Honda",30,2000);
		Car car6=new Car("Marie","TO658","BMW",15,10000);
		Car car7=new Car("Kenny","VE123","Lexus",20,13000);
		//creating an instance of class Garage.MyGarage
		MyGarage garage=new MyGarage();
		//calling add() method in class Garage.MyGarage()
		System.out.println("Adding seven cars to garage.");
		System.out.println("Garage.Car added?: " + garage.add(car1));
		System.out.println("Garage.Car added?: " + garage.add(car2));
		System.out.println("Garage.Car added?: " + garage.add(car3));
		System.out.println("Garage.Car added?: " + garage.add(car4));
		System.out.println("Garage.Car added?: " + garage.add(car5));
		System.out.println("Garage.Car added?: " + garage.add(car6));
		System.out.println("Garage.Car added?: " + garage.add(car7));

		//calling method totalValue() in class Garage.MyGarage()
		System.out.println("Combined value of the garage: " + garage.totalValue());

		//calling getCar() method in class Garage.MyGarage
		System.out.println(garage.toString(garage.getCar("DG543")));
		System.out.println(garage.toString(garage.getCar("VE123")));

		//calling getCarsByMake() method in class Garage.MyGarage
		System.out.println(garage.getCarsByMake("Honda"));
		System.out.println(garage.getCarsByMake("ford"));

		//calling method changeOwner() method in class Garage.MyGarage
		System.out.println("Before owner change.");
		System.out.println(garage.toString(garage.getCar("DG543")));
		System.out.println("Owner changed?: " + garage.changeOwner("DG543","Timmy"));
		System.out.println(garage.toString(garage.getCar("DG543")));

		//calling method changePrice() method in class Garage.MyGarage
		System.out.println("Price changed?: " + garage.changePrice("DG543",20000));
		System.out.println(garage.toString(garage.getCar("DG543")));

	}
}
