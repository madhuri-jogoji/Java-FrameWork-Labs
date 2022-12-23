
import java.util.*;

public class HashMap1<K,V> 
{
	Map<String,String> cmap=new HashMap<>();
	
	public void add(String state,String capital)
	{
		cmap.put(state, capital);
	}
	public void display()
	{
		System.out.println(cmap.entrySet());
//		for(Map.Entry<String,String> e:cmap.entrySet())
//		{
//			
//		}

	}
	public void sort()
	{
		TreeMap<String,String> tm=new TreeMap<>();
		tm.putAll(cmap);
		System.out.println(tm.entrySet());

	}
	public void search(String state)
	{
		if(cmap.containsKey(state))
		{
			System.out.println("state:"+state+"capital:"+cmap.get(state));

		}
		else 
		{
		System.out.println(state+"not present");
		}
	}
	public void update(String state,String capital)
	{
		if(cmap.containsKey(state))
		{
			cmap.replace(state, capital);
		}
		else 
		{
		System.out.println(state+"not present");
		}
	}
	public void remove(String state)
	{
		if(cmap.containsKey(state))
		{
			cmap.remove(state);
		}
		else 
		{
		System.out.println(state+"not present");
		}
	}
	
}

