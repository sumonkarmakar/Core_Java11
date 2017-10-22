// Suspending and resuming a thread for java 2.
package com.thread;
class NewThread8 implements Runnable
{
	String name;	// name of thread.
	Thread t;
	boolean suspendFlag;
	NewThread8(String threadname)
	{
		name = threadname;
		t = new Thread(this,name);
		System.out.println("New Thread: " + t);
		suspendFlag = false;
		t.start();		// start the thread.
	}
	// This is the entry point for the thread.
	public void run()
	{
		try
		{
			for(int i=15;i>0;i--)
			{
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized(this)
				{
					while(suspendFlag)
					{
						wait();
					}
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + "interrupted.");
		}
			System.out.println(name + " exiting.");
	}
	void mysuspend()
	{
		suspendFlag = true;
	}
	synchronized void myresume()
	{
		suspendFlag = false;
		notify();
	}
}
class SuspendResume1
{
	public static void main(String args[])
	{
		NewThread8 ob1 = new NewThread8("One");
		NewThread8 ob2 = new NewThread8("Two");
		
		try
		{
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspending thread one");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming thread one");
			ob2.mysuspend();
			System.out.println("Suspending thread two");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Resuming thread two");
		}catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted.");
		}
		
		// wait for threads to finish
		try
		{
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}
		
		