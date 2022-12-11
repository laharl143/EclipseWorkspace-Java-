public class Main {

	public static void main(String[] args) {
		
		// polymorphism = 	greek word for poly-"many", morph-"form"
		//					The ability of an object to identify as more than one type
		
		Car car = new Car();                 //Car is a subclass of Vehicle
		Bicycle bicycle = new Bicycle();	 //Bicycle is a subclass of Vehicle
		Boat boat = new Boat(); 			 //Boat is a subclass of Vehicle
											 
		Vehicle[] racers = {car,bicycle,boat}; //Hence you can use Vehicle as a polymorphism of the 3
		
		for(Vehicle x : racers) {
			x.go();
		}
		
	}
}