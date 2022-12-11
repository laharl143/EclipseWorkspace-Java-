public class Main {

	public static void main(String[] args) {
		
		// Encapsulation = 	attributes of a class will be hidden or private, 
		//					Can be accessed only through methods (getters & setters)
		//					You should make attributes private if you don't have a reason to make them public/protected
		
		Car car = new Car("Chevrolet","Camaro",2021);
		
		car.setYear(2022);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
	}

}


/*
 * Summary: Encapsulation , makes the attribute of other class private so other class can't access it;
 * If you need to retrieve these values, use getter method [getMake() , getModel(), etc]
 * If you need to change the values, use setter method [setMake() , setModel(), etc]
 * 
 */
