package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 
{
	/*
	 * --Lambda expressions basically express instances of functional interfaces
	 * --(An interface with single abstract is called functional interface. An examle is java.lang.Runnable).
	 * --lambda expressions implement the only abstract function and therefore implement functional interfaces
	 * (argument-list)->{body}
	 */
	interface building
	{
		public void room();
		//public void room1();
		default void dummy()
		{
			System.out.println("Non abstract interface method");
		};
	}
	public interface My1
	{
		double getPi();
	}
	interface calc
	{
		public int add(int a, int b);
		default float sub(int a, float b)
		{
			return a-b;
		}
	}
	public static void main(String[] args) 
	{
		//without lambda using anonymous class
		//no implements
		building d=new building()
				{
					public void room()
					{
						System.out.println("3500SQFT");
					}
				};
				building d1=new building()
						{
					public void room()
					{
						System.out.println("5300SQFT");
					}
						};
						d.room();
						d1.room();
						//jdk 1.8 or above
						//.with lambda but zero arguments
						//no separate .class file for interface
						building d2=()->
						{
							System.out.println("Lambda-4000SQFT");
						};
						d2.room();
						
						My1 m=()->3*3.145;
						
							System.out.println("value of pi= "+m.getPi());
						
						
						//multiple parameters in lambda expressions
						//without return keyword
						//datatypes are optional
						//calc ad1=(a,b)->(a+b); //valid
						calc ad1=(int a,int b)->(a+b); //valid
						System.out.println("Add: "+ad1.add(10, 20));
						System.out.println("Sub: "+ad1.sub(34, 4.0f));
						List<String> dept=new ArrayList<String>();
						dept.add("Finance");
						dept.add("Insurance");
						dept.add("Admin");
						
						//lambda foreach loop
						dept.forEach
						((n)->System.out.println(n)
								);
						
	}

}
