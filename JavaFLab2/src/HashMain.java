

import java.util.*;
public class HashMain {

	public static void main(String[] args) 
	{
		String state,capital;
		HashMap1 hm1=new HashMap1();
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Add\n2:Display\n3:sort\n4:search\n5:replace\n6:remove");
		while(true)
		{
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter state");
				state=sc.next();
				System.out.println("Enter capital");
				capital=sc.next();
				hm1.add(state, capital);
			}
			else if(ch==2)
			{
				hm1.display();
			}
			else if(ch==3)
			{
				hm1.sort();
			}
			else if(ch==4)
			{
				System.out.println("Enter state");
				state=sc.next();
				hm1.search(state);

			}
			else if(ch==5)
			{
				System.out.println("Enter state");
				state=sc.next();
				System.out.println("Enter capital");
				capital=sc.next();
				hm1.update(state, capital);
				
			}
			else if(ch==6)
			{
				System.out.println("Enter state");
				state=sc.next();
				hm1.remove(state);
			}

		}
	}

}
