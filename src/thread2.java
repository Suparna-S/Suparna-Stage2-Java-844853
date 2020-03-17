class thread2 implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
System.out.println("\n\t Child Current Thread: " +Thread.currentThread().getName());
			System.out.println("\n\t Child Thread: " + i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
		}
		System.out.println("\n\t Exiting child thread");
	}
	public static void main(String args[]) 
	{
thread2 obj=new thread2();
Thread t1=new Thread(obj); //valid
System.out.println("\n\t Before start method Thread Alive:  " + t1.isAlive());
t1.start();//call run method + creats OS level thread
System.out.println("\n\t After start method Thread  Alive:  " + t1.isAlive());
t1.setName("HCLThread");
	

		try
		{
			for(int j=5;j>0;j--)
			{
System.out.println("\n\t Main Current Thread: " +Thread.currentThread().getName());
		System.out.println("\n\t Main Thread: " +j);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
		System.out.println("\n\t Main Thread Exiting..");
System.out.println("\n\t After run method Thread Alive:  " + t1.isAlive());
	}

}