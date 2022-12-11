public class Human {

	String name;
	int age;
	double weight;
	
	Human(String name,int age,double weight){   //constructors don't have any return type ; it is used to distinguish between constructors and method
		
		this.name = name;     //this. keyword to assign name to the human constructor
		this.age = age;		  //this. keyword to assign age to the human constructor
		this.weight = weight; //this. keyword to assign weight to the human constructor
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}
		
}

/*
 * Java Constructors vs Java Methods
 * Constructors:				
 * It is a block of code which instantiate a newly created object.
 * They are invoked implicitly.
 * It does not have any return type.
 * It's name should be same as the class name.
 * 
 * Methods:
 * It is a collection of statements, always return a value.
 * They are invoked explicitly.
 * It may return a value.
 * It's name should not be same as the class name.
 */

