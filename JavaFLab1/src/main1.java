import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		List<student1> list = new ArrayList<student1>();


		student1 o= new student1("bhanu","1rv24","22");
		while(true) 
		{
			System.out.println("1.Add student details\n2.Update details\n3.remove the elements\n4.size of the list\n5.Display\n6.clearing elements\nEnter your choice");
			int ch=s.nextInt();
			switch(ch) {
			case 1:
				Scanner ss=new Scanner(System.in);
				System.out.println("Enter the no of student details you want to add");
				int n=ss.nextInt();
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter your name");
					String name=ss.next();
					System.out.println("Enter your usn");
					String usn=ss.next();
					System.out.println("Enter your age");
					String age=ss.next();
					student1 ob= new student1(name,usn,age);
					list.add(ob);
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
				student1 a1= new student1(name,usn,age);
				list.set(i, a1);
				break;
			case 3:
				System.out.println("Enter the index you want to delete");
				int a=s.nextInt();
				list.remove(a);
				break;
			case 4:
				list.size();
				break;
			case 5:
				o.display(list);
				break;
			case 6:
				list.clear();
				break;

			default:
				break;
			}
		}

	}


}
