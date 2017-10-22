// Create Multiple Thread
package com.thread;
class NewThread3 implements Runnable
{
	String name;
	Thread t;
	NewThread3(String threadname)
	{
		name = threadname;
		t = new Thread(this,name);
		System.out.println("New Thread: " + t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name + "Interrupted");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
class MultiThreadDemo
{
	public static void main(String args[])
	{
		new NewThread3("One");
		new NewThread3("Two");
		new NewThread3("Three");
		
		try
		{
			// wait for other thread to end
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}

		
		

			