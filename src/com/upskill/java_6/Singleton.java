package com.upskill.java_6;

public class Singleton {
// Singleton is class that can have only one object
// one class one object
// constructor overloading- one class multiple object
// constructor has the power to modify inside the class
// Private constructor, it prevents any other class from instantiating
	
private Singleton(){
	 
}
	// Private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	public static Singleton getInstance(){ // getInstance is a getter method (return type method)
		return SingletonObj; // Returning the class object
	}
	protected static void demo(){
		System.out.println("Demo Method for Singleton Class");
	}

}
