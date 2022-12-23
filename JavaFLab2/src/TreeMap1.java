

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1<K,V> 
{
	TreeMap<String,String> tm1=new TreeMap<>();
	
	
	public void add(String state,String capital)
	{
		tm1.put(state, capital);
	}
	public void display()
	{
		System.out.println(tm1.entrySet());
//		for(Map.Entry<String,String> e:cmap.entrySet())
//		{
//			
//		}

	}
	
	public void search(String state)
	{
		if(tm1.containsKey(state))
		{
			System.out.println("state:"+state+"capital:"+tm1.get(state));

		}
		else 
		{
		System.out.println(state+"not present");
		}
	}
	public void update(String state,String capital)
	{
		if(tm1.containsKey(state))
		{
			tm1.replace(state, capital);
		}
		else 
		{
		System.out.println(state+"not present");
		}
	}
	public void remove(String state)
	{
		if(tm1.containsKey(state))
		{
			tm1.remove(state);
		}
		else 
		{
		System.out.println(state+"not present");
		}

	}
	public void removeFromFirst()
	{
		tm1.pollFirstEntry();
		
		
	}
	public void removeFromLast()
	{
		tm1.pollLastEntry();
	}
	public void displayLastelements(String state)
	{
		System.out.println(tm1.headMap(state));
		
	}
	public void displayFirstelements(String state)
	{
		System.out.println(tm1.tailMap(state));

	}
}
