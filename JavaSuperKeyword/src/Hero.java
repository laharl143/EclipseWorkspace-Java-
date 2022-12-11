public class Hero extends Person{


	String power;
	
	Hero(String name,int age,String power){	
		super(name,age);       //super keyword refers to the superclass(parent) which is the person.java
		this.power = power;	   //this keyword refers to this class, Hero.java
	}
	
	public String toString() {
		return super.toString()+this.power;
	}
}