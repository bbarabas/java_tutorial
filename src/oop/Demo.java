package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");		
	}

	void sleep() {
		System.out.println(name + " is sleeping");		
	}
	
}


public class Demo {

	public static void main(String[] args) {
		
		//instantiating an object
		Person person1 = new Person();
		
		//define some properties
		person1.name = "Bogdan";
		person1.email = "b@g.com";
		person1.phone = "099999";
		
		//abstract
		person1.walk();
		
		person1.eat();
		person1.sleep();
		
				
	}
}
