import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main2 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		List<student2> list = new LinkedList<student2>();
		LinkedList<student2> list1 = new LinkedList<student2>(list);

   		   while(true) 
		   {
			   System.out.println("1.Add student details\n2.Update details\n3.remove the elements\n4.size of the list\n5.Display\n6.clearing elements\n7.Adding at First\n8.Adding at Last\n9.Remove at last\nEnter your choice");
			   int ch=s.nextInt();
			   switch(ch)
			   {
			   		case 1:
			   			System.out.println("Enter the no of student details you want to add");
			   			int n=s.nextInt();
			   			for(int i=0;i<n;i++)
			   			{
			   				System.out.println("Enter your name");
			   				String name=s.next();
			   				System.out.println("Enter your usn");
			   				String usn=s.next();
			   				System.out.println("Enter your age");
			   				String age=s.next();
			   				student2 ob= new student2(name,usn,age);
			   				list1.add(ob);
			   			}
			   			break;
			   		case 2:
			   			System.out.println("Enter the index you want to update");
			   			int i=s.nextInt();
			   			System.out.println("Enter your name");
			   			String name=s.next();
			   			System.out.println("Enter your usn");
			   			String usn=s.next();
			   			System.out.println("Enter your age");
			   			String age=s.next();
			   			student2 a1= new student2(name,usn,age);
			   			list1.set(i, a1);
			   			break;
			   		case 3:
			   			System.out.println("Enter the index you want to delete");
			   			int a=s.nextInt();
			   			list1.remove(a);
			   			break;
			   		case 4:
			   			int size = list1.size();
			   			System.out.println("Size of list = "+ size);
			   			break;
			   		case 5:
			   			student2.display(list1);
			   			break;
			   		case 6:
			   			list1.clear();
			   			break;
			   		case 7:
			   			System.out.println("Enter your Name");
			   			String name1=s.next();
			   			System.out.println("Enter your usn");
			   			String usn1=s.next();
			   			System.out.println("Enter your age");
			   			String age1=s.next();
			   			student2 ob1= new student2(name1,usn1,age1);
			   			list1.addFirst(ob1);
			   			break;
			   		case 8:
			   			System.out.println("Enter your Name");
			   			String name2=s.next();
			   			System.out.println("Enter your usn");
			   			String usn2=s.next();
			   			System.out.println("Enter your age");
			   			String age2=s.next();
			   			student2 ob2= new student2(name2,usn2,age2);
			   			list1.addLast(ob2);
			   			break;
			   		case 9:
			   			list1.removeFirst();
			   			break;
			   		case 10:
			   			list1.removeLast();
			   			break;
			   		default:
			   			break;
			   }
		   }

		}

}
