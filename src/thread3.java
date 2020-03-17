class mythread100 extends Thread
{
//Problem: mythread class cannot inherit from any other class. 
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
System.out.println("\n\t Current Thread: " +Thread.currentThread().getName());
			System.out.println("\n\t Child Thread " +i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("\n\t Exiting child thread");
	}
}
class thread3
{
	public static void main(String args[])
	{
		mythread100 t1=new mythread100();
System.out.println("\n\t Before start method Thread Alive:  " + t1.isAlive());
	t1.start();//call run method + creats OS level thread
	System.out.println("\n\t After start method Thread  Alive:  " + t1.isAlive());
	t1.setName("HCLChennaiThread");
		try
		{
			for(int k=5;k>0;k--)
			{
System.out.println("\n\t Current Thread: " +Thread.currentThread().getName());
			System.out.println("\n\t Running main thread: " +k);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("\n\t Exiting main thread..");
		System.out.println("\n\t After run method Thread Alive:  " + t1.isAlive());
	}
}
