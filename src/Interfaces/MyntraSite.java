package Interfaces;

class Herit
{
	void go()
	{
		System.out.println("CLASS GO() METHOD");
	}
}
interface a
{
	void dis();
}
interface b
{
	void dis1();
}
interface c extends a,b
{
	void dis2();
} 
//class implement more than one interface
//interface can extend more than one interface
//first extends then implements
public class MyntraSite extends Herit implements Shopping,c
{
	@Override
	public void additem() {
		System.out.println("Add Item Interface Method");
	}
	@Override
	public String view(String msg) {
		return msg;
	}
	@Override
	public void dummy()
	{	}
	//CLASS METHOD
	public void msg()
	{
		System.out.println("YOU WILL GO AND SEE THEM ONE DAY!!");
	}
	public static void main(String[] args) {
		MyntraSite s1=new MyntraSite();
		s1.additem();
		System.out.println(s1.view("SHOPPING DONE"));
		s1.dis();
		s1.dis1();
		s1.dis2();
		s1.msg();
		//a obj1=new a(); //interface cannot be instantiated
		//runtime polymorphism
		a obj1=new MyntraSite();
		obj1.dis();
		((MyntraSite)obj1).msg(); //object casting
		}
		@Override
		public void dis()
		{
			System.out.println("A Interface found");
		}
		@Override
		public void dis1()
		{
			System.out.println("B Interface found");
		}
		@Override
		public void dis2()
		
		{
			System.out.println("C Interface Method");
		}
}
