package Abstract_Classes;

abstract class Dum1 {
	
	void check()
	{
		System.out.println("Abstract class contains only concrete method");
	}
}
abstract class shopping1
{
//concrete method or non abstract method
	void feedback()
	{
		System.out.println("********");
	}
	//abstract method cannot have a body
	abstract void additem();
	abstract void delitem();
}	
/*
 * When an abstract class is subclasses, the subclass usually provides implementations for all the abstract methods
 * in its parent class. However, if it does not, the subclass must also be declared abstract.
 */
abstract class flipkart extends shopping1

{
	void additem()
	{
		System.out.println("Flipkart-Item added");
	}
	
}
class amazon extends shopping1{

	@Override
	void additem() {
		// TODO Auto-generated method stub
		System.out.println("Amazon-Item added");
		
	}

	@Override
	void delitem() {
		// TODO Auto-generated method stub
		System.out.println("Amazon-Item deleted");
		
	}
	
}
public class AbstractDemo
{
public static void main(String[] args) {
		//shopping a1=new shopping(); //no object
		//flipkart f1=new flipkart(); //no object
		amazon a1=new amazon();
		a1.additem();
		a1.delitem();
		a1.feedback();

	}

	}
