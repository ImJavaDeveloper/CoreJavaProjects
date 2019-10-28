package com.java.core.multithread.paralleltask;

public class ParallelTask implements Runnable{

	private Thread t;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Is Started");
		if(t!=null)
		{
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" Is Finshed");
		
	}
	
	public void setThread(Thread thread)
	{
		this.t=thread;
	}

}
