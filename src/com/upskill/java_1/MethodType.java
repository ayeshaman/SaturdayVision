package com.upskill.java_1;

public class MethodType {

		/* Types of Method
		 1. Void Method
		 2. Static Method
		 3. Return Type Method	 
		 */
	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		System.out.println("upskill");
		weeklyIncomeStatic();
		
		
		MethodType myObj = new MethodType(); // creating object for non static method
		myObj.annualIncomeVoid();
		
		System.out.println("My monthly Income = " + myObj.monthlyIncomeReturn());
	}
	
// void method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
	System.out.println("my annual income = " + calculateAnnualIncome);
	}

//static method
	public static void weeklyIncomeStatic(){
		int calculateweeklyIncome = hourlyIncome * 40;
	System.out.println("my weekly income = " + calculateweeklyIncome);
	}
	
// Return Type Method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
		
	}


}
