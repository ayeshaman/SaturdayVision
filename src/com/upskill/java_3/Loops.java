
package com.upskill.java_3;

public class Loops {
	/*
	 Types of Loops
	 1. For Loops
	 2. While Loops
	 3. Do while Loop
	 4. Infinite Loop
	 */

	public static void main(String[] args) {
		//practiceForLoop();	
		//practiceWhileLoop();
	//	practiceDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedForLoop();
	}
	public static void practiceForLoop(){ // for loop- Do again and again upto upper limit
		int i;      			// Initialize the variable
		for(i =1; i<= 10; i++){; // Setting lower limit, upper limit, increment or decrement
		System.out.println("for loop Number = " + i);  // Statement
								
	}

	}
	public static void practiceWhileLoop(){ // While loop- Do again and again upto condition match
		int i = 1;				// Initialize the variable
		while(i<=10){			// setting condition
			System.out.println("while loop Number = " + i); // statement
			i++;				// increment or Decrement
		}
	}
	public static void practiceDoWhileLoop(){
		int i = 1;				// Do While Loop- Do action then match condition
		do{						// Initialize the variable
			System.out.println("Do while Loop Number = " + i); // Statement
			i++;										// Increment or Decrement
		} while ( i <= 0);								// Checking condition
	}
	public static void practiceInfiniteLoop(){   // Infinite Loop- never ending loop
		int i ;									// initialize the variable
		for(i = 1; ; i++){						// setting no upper limit
			System.out.println("Infinite loop Number = " + i); // statement			
		}
	}
	
	public static void practiceNestedForLoop(){
		int i;
		int j;
		for (i = 1; i<=10; i++){
			for( j = 1; j <= 10; j++){
			int multiplicationTable = i * j;
			System.out.print(multiplicationTable + " ");	
		}
			System.out.println(" ");
	}
	
		}
	
}

