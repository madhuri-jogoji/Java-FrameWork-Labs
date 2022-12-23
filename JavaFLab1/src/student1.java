

import java.util.*;

public class student1 {
	String name,usn,age;
	student1(String name,String usn,String age)
	{
		this.name=name;
		this.age=age;
		this.usn=usn;
	}
	public void display(List<student1> list) 
	{
		Iterator<student1> itr=list.iterator();
		while(itr.hasNext())
		{
			student1 ar=itr.next();
			System.out.println("Name:"+ar.name+"Age:"+ar.age+"Usn:"+ar.usn);

		}

	}

}