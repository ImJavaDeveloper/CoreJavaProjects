package com.java.core.multithread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteTask 
{ 
	// Maximum number of threads in thread pool 
	static final int MAX_T = 3;			 

	public static void main(String[] args) 
	{ 
		// creates five tasks 
		Task task1 = new Task("task 1"); 
		Task task2 = new Task("task 2"); 
		Task task3 = new Task("task 3"); 
		Task task4 = new Task("task 4"); 
		Task task5= new Task("task 5");	 
		
		// creates a thread pool with MAX_T no. of 
		// threads as the fixed pool size(Step 2) 
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T); 
		
		// passes the Task objects to the pool to execute (Step 3) 
		pool.execute(task1); 
		pool.execute(task2); 
		pool.execute(task3); 
		pool.execute(task4); 
		pool.execute(task5); 
		
		// pool shutdown ( Step 4) 
		pool.shutdown();	 
	} 
} 


