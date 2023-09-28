package com.upskill.java_4;

public class Encapsulation {
	// makanism to hide the data using setter and getter method
	// Making the data private
	// get and set method
	// write and read only acess
	// 
	
		private String name = "upskill";   //Write & Read
		private int ssn    = 123456;     //Write only
		private String username = "upskill"; //Read only
		
		

		public static void main(String[] args) {
			Encapsulation obj = new Encapsulation();
			obj.setSSN(1234567);
			System.out.println(obj.getUsername());
			
			obj.setName("Laila");
			System.out.println(obj.getName());
			
		}
		
	
		//setter Method - ssn                    //set the data,Write only
		public void setSSN(int value){
			ssn =value;
		}
	     //Getter Method - username              // get the data, read only
		
		
		
		
		
		
		
		public String getUsername(){
			return username;
		}
		
		public void setName(String value){
			name =value;
	}
		public String getName(){
			return name;
	}	
	}
