

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class MainExecute {

	SessionFactory sc = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	
	public void insert(int empid,String name,int salary,String address) {
		Session session = sc.openSession();
		Transaction t = session.beginTransaction();
		employee e1=new employee();
		e1.setEmpid(empid);
		e1.setName(name);
		e1.setSalary(salary);
		e1.setAddress(address);
		session.save(e1);
		t.commit();
		System.out.print("Entered Succesfully");
		}

	public void update(int empid,String name) {
	
		Session session = sc.openSession();
		Transaction t = session.beginTransaction();
	    Query query = session.createQuery("update employee set name = '"+name+"' where empid ='"+empid+"'");
	    query.executeUpdate();
	    System.out.print("updated Succesfully");
//		
		t.commit();
	}
	
	public void delete(int empid) {
		Session session = sc.openSession();
		Transaction t = session.beginTransaction();
		employee e=new employee();
		e.setEmpid(empid);
		session.delete(e);
		t.commit();
		System.out.println("Deleted");
	}
	
	
	public void display() {
		Session session = sc.openSession();
		Transaction t = session.beginTransaction();
		Query q = session.createQuery("from employee");
		List<?> l = q.getResultList();
		Iterator<?> it = l.iterator();
		if(!it.hasNext()) {
			System.out.println("\n\nNo Employees!!!\n");

		}
		while (it.hasNext()) {
			employee e1 = (employee) it.next();
			System.out.println("\nEmp ID :"+e1.getEmpid()+
					"\t\tName :"+e1.getName()+
					"\nSalary :"+e1.getSalary()+
					"\t\tAddress :"+e1.getAddress());
		}
		t.commit();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainExecute m1=new MainExecute();
		Scanner sc=new Scanner(System.in);
		int empid,salary,ch=0;
		String name,address;
		while(true) {
		System.out.println("\n\n1.Insert\t2.Update\n3.Delete\t4.Display\nPress 0 to exit\n");
		ch=sc.nextInt();		
			if(ch==1) {
				System.out.println("Emp ID :");
				empid=sc.nextInt();
				System.out.println("Name :");
				name=sc.next();
				System.out.println("Salary :");
				salary=sc.nextInt();
				System.out.println("Address :");
				address=sc.next();
				m1.insert(empid, name, salary, address);
			}
			else if(ch==2) {
				System.out.println("Emp ID :");
				empid=sc.nextInt();
				System.out.println("Name :");
				name=sc.next();
				m1.update(empid, name);
			}
			else if(ch==3) {
				System.out.println("Emp ID :");
				empid=sc.nextInt();
				m1.delete(empid);
			}
			else if(ch==4) {
				m1.display();
			}
			else {
				break;
			}
		}
	}
}
