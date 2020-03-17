package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Java 8, the Stream api is used to process collections of objects.
 * --Designed for lambdas
 * --Do not support indexed access
 * --Can easily be outputted as arrays or lists
 */
class Stream1
{
	String pname;
	float price;
	public Stream1(String pname, float price)
	{
		super();
		this.pname=pname;
		this.price=price;
	}
}
	public class StringAPI
{
	public static void main(String[] args) 
	{
		List<Stream1> pr1=new ArrayList<Stream1>();
		pr1.add(new Stream1("HP",25000f));
		pr1.add(new Stream1("Dell",35000f));
		pr1.add(new Stream1("Lenovo",25000f));
		List<Float> pr2=new ArrayList<Float>();
		for(Stream1 stream1: pr1)
		{
			//filtering data of list
			if(stream1.price<3000)
			{
				pr2.add(stream1.price);
				//adding price to a pr2
			}
		}
		System.out.println("After filter: "+pr2);  //displaying data
		//Stream API
		List<Float> f1=pr1.stream()
		.filter(e->e.price<30000) //filtering data
		.map(e->e.price) //fetching price
		.collect(Collectors.toList()); //collecting as list
		System.out.println("Stream Filetr: "+f1);
		
		//count number of products based on the filter
		long count=pr1.stream()
				.filter(ps->ps.price<30000)
				.count();
		System.out.println("Stream filter countr:L "+count);
		
		pr1.stream()
		.filter(ps1->ps1.price<30000)
		.forEach(ps2->
		System.out.println("<THAN 30000 Pname: "+ps2.pname));
	}

}
