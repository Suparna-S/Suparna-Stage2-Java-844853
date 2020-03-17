package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Collection1 
{
	public static void main(String[] args)
	{
		HashSet<Object> hset=new HashSet<Object>(); //random order
		//Set hset=new HAshSet(); //valid
		//unordered
		hset.add(244);
		hset.add(new Integer("2"));
		hset.add(new Integer("4"));
		hset.add(new Integer("2"));
		hset.add(new Float("43.654"));
		hset.add(new String("BTS"));
		System.out.println("Hashset contains: "+hset);
		System.out.println("Hashset Size: "+hset.size());
		System.out.println("Is Hashset Empty ? "+hset.isEmpty());
		
		Iterator itr=hset.iterator();  //iterator interface
		System.out.println("Hashset contains: ");
		while(itr.hasNext()) //i++
			System.out.println(itr.next()); //display thr current element
		List<Object> arrayList=new ArrayList<Object>();  //valid Syntax
		arrayList.add("4");
		arrayList.add("25");
		arrayList.add("7");
		arrayList.add("4");
		arrayList.add("Bangtan");
		arrayList.add(32.44f);
		System.out.println("ArrayList Contains: "+arrayList);
		for(Object a: arrayList)
			System.out.println(a);
	}
}
