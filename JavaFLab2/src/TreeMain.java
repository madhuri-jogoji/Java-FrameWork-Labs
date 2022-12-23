import java.util.*;
public class TreeMain {

	public static void main(String[] args) 
	{
		String state,capital;
		TreeMap1 t1=new TreeMap1();
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Add\n2:Display\n3:search\n4:replace\n5:remove\n6:removeFromfirst\n7:removeFromLast\n8:displayLastelements\n9:displayFirstelements");
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
				t1.add(state, capital);
			}
			else if(ch==2)
			{
				t1.display();
			}
			
			else if(ch==3)
			{
				System.out.println("Enter state");
				state=sc.next();
				t1.search(state);

			}
			else if(ch==4)
			{
				System.out.println("Enter state");
				state=sc.next();
				System.out.println("Enter capital");
				capital=sc.next();
				t1.update(state, capital);
				
			}
			else if(ch==5)
			{
				System.out.println("Enter state");
				state=sc.next();
				t1.remove(state);
			}
			else if(ch==6)
			{
				t1.removeFromFirst();
			}
			else if(ch==7)
			{
				t1.removeFromLast();
			}
			else if(ch==8)
			{
				System.out.println("Enter state");
				state=sc.next();
				t1.displayFirstelements(state);
			}
			else if(ch==9)
			{
				System.out.println("Enter state");
				state=sc.next();
				t1.displayLastelements(state);
			}
			else
			{
				break;
			}

		}
	}

}
