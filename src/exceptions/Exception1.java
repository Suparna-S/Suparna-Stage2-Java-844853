package exceptions;

public class Exception1 {

	public static void main(String[] args) 
	{
		int d,a;
		try
		{
			d=0;
			a=42/d;
			System.out.println("\n\t The result is: "+a);
		}
		catch(Throwable e)
		//catch(Exception e)
		//catch(ArithmeticException e)
		{
			System.out.println("\n\t Division by 0:");
			System.out.println("\n\t Exception: "+e);
			System.out.println("\n\t Exception: "+e.getMessage());
			e.printStackTrace(); //directly send to console window
		}
		//Code enclosed within a finally block will always be executed(whether or not an exception occurs)
		finally
		{
			System.out.println("\n\t After catch statement");
		}
		System.out.println("Program continues......");
	}
}
