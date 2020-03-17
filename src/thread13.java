class Parentheses 
{
synchronized  void display(String s) 
   {
   	System.out.print ("(" + s);
   	try 
	{
     		Thread.sleep (3000);
System.out.println("\n\t Current Thread: " +Thread.currentThread().getName()+ " "+Thread.currentThread().getPriority());

  	 }
	 catch (InterruptedException e) 
	{
	        System.out.println ("Interrupted");
	}
	 System.out.println(")");
  }
}

class MyThread implements Runnable 
{
   String s1;
   Parentheses p1;
   Thread t;
   public MyThread (Parentheses p2, String s2) 
  {
      p1= p2;
      s1= s2;  
  }
   public void run() 
  {
     p1.display(s1);
   }
}

class thread13
{
   public static void main (String args[]) 
  {
     Parentheses p3 = new Parentheses();
Thread t1=new Thread(new MyThread(p3,"HCL"));
Thread t2=new Thread(new MyThread(p3,"Technologies"));
Thread t3=new Thread(new MyThread(p3,"Limited"));
Thread t4=new Thread(new MyThread(p3,"Chennai"));
t4.start();
t4.setName("FourthThread");
t1.start();
t1.setName("FirstThread");
t2.start();
t2.setName("SecondThread");
t3.start();
t3.setName("ThirdThread");
  }
}