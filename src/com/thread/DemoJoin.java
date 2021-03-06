// Using join() to wait for thread to finish.
package com.thread;
class NewThread5 implements Runnable
{
	String name;
	Thread t;
	NewThread5(String threadname)
	{
		name = threadname;
		t = new Thread(this,name);
		System.out.println("New thread: " + t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " exiting.");
	}
}
class DemoJoin
{
	public static void main(String args[])
	{
		NewThread5 ob1 = new NewThread5("One");
		NewThread5 ob2 = new NewThread5("Two");
		NewThread5 ob3 = new NewThread5("Three");
		System.out.println("Thread one is alive:  " + ob1.t.isAlive());
		System.out.println("Thread two is alive:  " + ob2.t.isAlive());
		System.out.println("Thread three is alive:  " + ob3.t.isAlive());
		try
		{
			System.out.println("Waiting for thread to finish.");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("Thread one is alive:  " + ob1.t.isAlive());
		System.out.println("Thread two is alive:  " + ob2.t.isAlive());
		System.out.println("Thread three is alive:  " + ob3.t.isAlive());
		System.out.println("Main Thread Exiting.");
	}
}

			
		
		