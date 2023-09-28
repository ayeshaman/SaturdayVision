package com.upskill.java_4;

public class Constructor {
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature 
	-	Reference type default values are String= NULL, Integer= 0
	*/
	
	String studentName;
	int studentAge;
	
	 Constructor(String name) { // Parameterized COnstructor
		studentName =name;
	}
	 Constructor(String name, int age) { // overloading constructor, parameterized constructor, differ signature
		studentName =name;
		studentAge  =age;
		
	}
	 
	 Constructor(){ // default constructor
		 //System.out.println("No value");
	 }
	
	
	public static void main(String[] args) {
		Constructor obj = new Constructor ("Upskill");
		
				Constructor obj2 = new Constructor ("Riyan",25);
				System.out.println(obj2.studentName);
				System.out.println(obj2.studentAge);
				Constructor obj3 = new Constructor();
				System.out.println("No value");
	}

}

