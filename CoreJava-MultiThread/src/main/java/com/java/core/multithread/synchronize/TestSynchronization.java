package com.java.core.multithread.synchronize;




/*This class test if method are being called is synchronized or not.
 * 
 * 
 */
public class TestSynchronization {
	
	public static void main(String[] args) {
		System.out.println("Running Main.....");
		//RunnableThread tr1=new RunnableThread();
		/*Thread t1=new Thread(tr1,"Thread 1");
		t1.start();
		
		RunnableThread tr2=new RunnableThread();
		Thread t2=new Thread(tr1,"Thread 2");
		t2.setPriority(8); //setting priority but it does not gurantted the sequence of thread
		t2.start();
		
		Thread t3=new Thread(tr2,"Thread 3");
		
		//t3.start();
		 * 
		 * 
*/		
		RunnableThread tr=new RunnableThread();
		for(int i=0;i<100;i++)
		{
			//RunnableThread tr=new RunnableThread();
			Thread t=new Thread(tr,"Thread"+i);	
			t.start();
		}
		System.out.println("Current Main Thread Priority:"+Thread.currentThread().getPriority());
		
	}

}
