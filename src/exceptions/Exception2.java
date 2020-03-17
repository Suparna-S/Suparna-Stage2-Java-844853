package exceptions;

public class Exception2 
{
	static void throwExcp() throws IllegalAccessException
	{
		try
		{
			throw new IllegalAccessException("Going to method catch block"); //exception thrown
		}
		//exception caught
		catch(IllegalAccessException e)
		{
			System.out.println("catch block");
			System.out.println("Msg: "+e);
			throw new IllegalAccessException("Going to main method");
			//exception thrown again
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			throwExcp();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught: e");
		}
	}

}
