package com.upskill.assignment_2;

public class Assignment_2_6 {
	public static void main(String[] args){
	int max = 100;
	System.out.println("Prime number between 1 and " + max);
	 
	for ( int x =1; x < 100; x++) {
		boolean isprime = true;
	
	 for (int j=2; j < x; j++){ // check if the num is prime
		 if( x % j == 0){
			 isprime = false;
			 break;
		 }
	 }
	if(isprime)
		System.out.println( x + " ");
	}
	

	}
}


