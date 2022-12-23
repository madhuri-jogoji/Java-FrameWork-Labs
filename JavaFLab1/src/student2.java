

import java.util.*;

public class student2 
{
	String name,usn,age;
	student2(String name,String usn,String age)
	{
		this.name=name;
		this.age=age;
		this.usn=usn;
	}
	public static void display(List<student2> list) 
	{
		Iterator<student2> itr=list.iterator();
		while(itr.hasNext()) 
		{
			student2 ar=itr.next();
			System.out.println("Name:"+ar.name+"Age:"+ar.age+"Usn:"+ar.usn);

		}

	}


}