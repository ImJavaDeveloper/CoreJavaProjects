package com.java.core.thread;

public class ThreadRunnable implements Runnable {

	int count;
	@Override
	public void run() {
		count++;
		System.out.println("Starting Runnable Thread:"+this.getClass().getName());
		System.out.println("ThreadName:"+Thread.currentThread().getName());
		System.out.println("Count:"+Thread.currentThread().getName()+"-"+count);
		
		
		
	}

}
