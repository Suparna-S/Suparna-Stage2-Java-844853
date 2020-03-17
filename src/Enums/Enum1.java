package Enums;

//to define our own data types.
/*
 * Enum can also be declared outside the class or inside but not inside a method
 * Enum constant is always implicitly public static final. so it cannot be changed.
 * Since, it is static , we can access it by using enum Name.
 * enum cannot be used to create objects. And it cannot extend other classes
 */
enum dept
{
	Insurance, Training, Pitstop, Network;
	String display()
	{
		String msg="You are working in "+this+"dept";
		System.out.println("Inside Enum: "+msg);
		return msg;
	}
}
public class Enum1 {
enum month{
	January, February, March, April
}
	public static void main(String[] args) {
		System.out.println("Enum: "+dept.Insurance);  //enumname.constant
		dept c1[]=dept.values();
		for(dept j1:c1)
		{
			System.out.println("Dept Datatypes: "+j1);
		}
		System.out.println("Enum method: "+dept.Pitstop.display());
		month m1;
		m1=month.January;
		switch(m1)
		{
		case February: System.out.println("WARM");
		break;
		case January: System.out.println("WINTER");
		break;
		default: System.out.println("I DON'T KNOW!");
		break;
		}
		final String name="Bangtan Sonyeondan!";
		//name="Devi"; //cannot be altered
		System.out.println(name);
	}

}
