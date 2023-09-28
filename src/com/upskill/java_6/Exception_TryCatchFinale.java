package com.upskill.java_6;

public class Exception_TryCatchFinale {

// exception is a logical error
// if you do some logical error java will show you what your doing wrong
// you handle the exception using try and catch and finally block
/* Java Exceptions - Use "try - catch - finally"
 * 
	A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations( like premitive data type)
		 1. ArithmeticException - error has occurred in an arithmetic operation.
		 2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index.
		 3. ClassNotFoundException - try to access a class whose definition is not found
		 4. FileNotFoundException - a file is not accessible or does not open.
		 5. IOException - input-output operation failed or interrupted
		 6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
		 7. NoSuchFieldException - class does not contain the field or variable specified
		 8. NoSuchMethodException - accessing a method which is not found
		 9. NullPointerException - referring to the members of a null object
		 10. NumberFormatException  -  a method could not convert a string into a numeric format
		 11. RuntimeException - any exception which occurs during runtime.
		 12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string
	
	B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
*/
 public static void main(String[] args){
	 
	 //Built in Exceptions- ArrayIndexOutOfBoundsException
	 try{		 
		 int[] ageVision = new int[]{25, 35, 26, 28, 30};
		 System.out.println("Student age= " + ageVision[6]);
	 }catch (Exception e){  // e is exception
		e.printStackTrace();  // to print out the exception 
		 System.out.println("Array memeber not available!");
	 }
	// Specific Build-in Exception- NumberFormatException
	 try {
		 int num = Integer.parseInt("test"); 
	 }catch ( NumberFormatException e){   // it will only catch specific exception
		 e.printStackTrace();
		 System.out.println("It is not an integer value");
	 }
	 
	 // User Defined Exception- defining your own exception
	 // create a constructor and pass a constructor using throw my exception which is defined by user
	 try {
		 throw new myException("test"); 
	 }catch (Exception e){   // it will only catch specific exception
		 e.printStackTrace();
		 System.out.println("This Exception is defnied by User");
	 }
	 finally { // is a conclusion line. summary line. 
		 System.out.println("Test Execution Complete");
	 }
	 
 }
 }
