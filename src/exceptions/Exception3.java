package exceptions;
/*
 * user-defined exception classes can either inherit from throwable class or more correctly inherit from 
 * Exception class.
 * 
 * class calcexception extends Throwable
 */
 class calcexception extends Exception
{
	public String toString()
	{
		return "UserException caught: The sum of num exceeds 20...";
	}
}
	public class Exception3
	{
		static void calculate(int a, int b) throws calcexception
		{
			int sum;
			System.out.println("Calculate Method("+a+","+b+")");
			sum=a+b;
			if(sum>20)
			{ throw new calcexception();  }
			System.out.println("The value of the sum of 2 numbers: "+sum);
		}
		public static void main(String[] args) 
			{
				try
				{
					calculate(12,1);
					calculate(15,8);
				}
				catch(calcexception obj)
				{
					System.out.println("Caught: "+obj);
					System.out.println("Caught: "+obj.toString());
				}
			}

}
