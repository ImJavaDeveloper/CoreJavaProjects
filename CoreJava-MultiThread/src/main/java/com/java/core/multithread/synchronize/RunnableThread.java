package com.java.core.multithread.synchronize;

public class RunnableThread implements Runnable {

	int i=1;
	SyncnronizationExample syn=null;
	public RunnableThread() {
	syn=new SyncnronizationExample();
	//System.out.println("Constructer calling");
}
	@Override
	public void run() {
		//System.out.println("Name:"+Thread.currentThread().getName()+"-Id:"+Thread.currentThread().getId()+"-Priority:"+Thread.currentThread().getPriority());
        i=i+1;
		//System.out.println("count:"+i);
		//System.out.println("Object:"+syn);
		//syn.synchronizedMethod();
		syn.nonSynchronized();
        //SyncnronizationExample.staticSynchronizedMethod();
		
	}

}
