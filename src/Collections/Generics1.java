package Collections;

import java.util.ArrayList;
import java.util.List;

public class Generics1 
{
	public static void print(List<?>obj)
	//unbounded wildcard
	{
		for(Object element:obj)
		{
			System.out.println(element);
		}
	}
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Java 1.0-5.0");
		a1.add(23545.34f); //float
		//non generic - typecasting
		String s1=(String)a1.get(0);
		System.out.println("Non generic: "+s1);
		
		ArrayList<String> a2=new ArrayList<String>();
		ArrayList<String> a3=new ArrayList(); //valid
		a2.add("Java");
		// a2.add(545); //error
		//a2.add(5463.98f); 
		a2.add("Dotnet");
		String s2=a2.get(0); //no typecasting
		System.out.println("Generic: "+s2);
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		print(list2);
	}

}
