package com.java.core.thread;

public class ThreadExtendThread extends Thread {
	
	 int count =0;
	public void run()
	{
		count++;
		System.out.println("Extend Thread Name:"+this.getName());
		System.out.println("Extend count"+count);
	}

}
