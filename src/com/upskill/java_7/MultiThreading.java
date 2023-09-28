package com.upskill.java_7;

public class MultiThreading {
	// Multithreading is a java feature that allows concurrent execution of two or more parts of a program.
	// multiple work at the same time.
	// Threads can be created by using two mechanism:
	// 1. Extending the Thread class
	// 2. Implementing the Runnable Interface
	
	
	public static void main(String[] args) {
		int n = 5;
		for(int i = 0; i < n ; i++){
			MultiThreadingThread obj = new MultiThreadingThread();
			obj.start();
			
			Thread obj2 = new Thread(new MultithreadingRunable());
			obj2.start();
			
		}

	}

}
