package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1
{ 
	public static void main(String[] args) 
	{
		//unordered
		Map<Integer,String> hash_map=new HashMap<Integer,String>();
		hash_map.put(10,"Insurance");
		hash_map.put(15,"Finance");
		hash_map.put(20,"Admin");
		hash_map.put(25,"Training");
		System.out.println("HashMap: "+hash_map);
		//iterating over keys only
		for(Integer key:hash_map.keySet())
		{
			System.out.println("Key="+key);
		}
		//iterating over values only
		for(String value:hash_map.values())
		{
			System.out.println("Value="+value);
		}
		String b=hash_map.get(10); //key
		hash_map.put(10, "Testing");
		System.out.println("Newdata: "+hash_map.get(10));
		
		//ordered ----all keys are sorted
		TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>(hash_map);
		System.out.println("TreeMap: "+tree_map);
		
	}

}
