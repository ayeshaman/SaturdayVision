package com.upskill.java_7;

public class MultithreadingRunable implements Runnable {

	@Override
	public void run() {
			try{
				System.out.println("Thread Number" + +Thread.currentThread().getId()+" is running"); // get the thread number 
			}catch (Exception e){
				System.out.println("Exception is caught");
			}
		}
	}

