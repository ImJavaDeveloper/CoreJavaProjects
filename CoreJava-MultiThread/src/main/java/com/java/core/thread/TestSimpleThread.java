/**
 * 
 */
/**
 * @author Rahat
 *
 */

package com.java.core.thread;

public class TestSimpleThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadExtendThread t1=new ThreadExtendThread();
		t1.setName("Thread 1");
		
       
		ThreadExtendThread t2=new ThreadExtendThread();
		t2.setName("Thread 2");
		
		t1.start();
		Thread.sleep(1000);
		t2.start();
		Thread.sleep(1000);
		
		ThreadRunnable tr1=new ThreadRunnable();
		ThreadRunnable tr2=new ThreadRunnable();
		Thread t3=new Thread(tr1,"thread3");
		Thread t4=new Thread(tr1,"thread4");
		Thread t5=new Thread(tr2,"thread5");
		
		//System.out.println("Starting Thread:"+t3.getName());
		//t3.start();
		//t3.sleep(1000);
		//t4.start();
		//System.out.println("Starting Thread:"+t4.getName());
		//t4.sleep(1000);
		//t5.start();
		//System.out.println("Starting Thread:"+t5.getName());
		
	
	for(int i=0;i<100;i++)
	{
		Thread t=new Thread(tr1,"thread-"+i);	
		t.start();
	}
	
  }
}
