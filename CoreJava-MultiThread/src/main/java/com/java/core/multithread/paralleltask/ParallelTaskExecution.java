package com.java.core.multithread.paralleltask;

public class ParallelTaskExecution {
	
	
	public static void main(String[] args) {
		//Creating Parralel Task
	ParallelTask p1=new ParallelTask();	
	ParallelTask p2=new ParallelTask();	
	ParallelTask p3=new ParallelTask();	
	
	//Creating Object of thread
	Thread t1=new Thread(p1,"Thread 1");
	Thread t2=new Thread(p2,"Thread 2");
	Thread t3=new Thread (p3,"Thread 3");
	//Running Each Thread
	t1.start();
	t2.start();
	t3.start();
	}

}
