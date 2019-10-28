/**
 * 
 */
/**
 * @author Rahat
 *
 */
package com.java.core.multithread.synchronize;

public class SyncnronizationExample
{
	int synCounter =1;
	int nonSynccounter =1;
	private  static int staticCount=1;
	
	public synchronized void synchronizedMethod()
	{
		//System.out.println(" This synchronized method is locked by current instance of object i.e. this");
		System.out.println("Calling Thread From Synchronized :"+Thread.currentThread().getName()+"-Reading counter value:"+synCounter);
		synCounter=synCounter+1;
	}
   public static synchronized void staticSynchronizedMethod()
   {
	   //System.out.println(" This static synchronized method is locked by class level lock of this class i.e. SychronizationExample.class" );
	   System.out.println("Calling Thread From static Synchronized :"+Thread.currentThread().getName()+"-Reading counter value:"+staticCount);
	   staticCount=staticCount+1;
   }
   public void lockedBySynchronizedBlock(){
       System.err.println("This line is executed without locking");
     
       Object obj = String.class; //class level lock of Stirng class
     
       synchronized(obj){
           System.out.println("synchronized block, locked by lock represented using obj variable");
       }
       
       
   }
   public  void nonSynchronized()
	{
	System.out.println("Calling Thread From Non-Synchronized:"+Thread.currentThread().getName()+"-Reading counter value:"+nonSynccounter);
	nonSynccounter=nonSynccounter+1;
	//System.out.println(" This synchronized method is locked by current instance of object i.e. this");

	}

}