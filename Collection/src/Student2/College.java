package Student2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College {
	public List<Student> m1(){
		/*List<Student> list=new ArrayList<>();
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("vishal");
		list.add(s1);

		s1=new Student();
		s1.setRollno(2);
		s1.setName("vicky");
		list.add(s1);

	    s1=new Student();
		s1.setRollno(3);
		s1.setName("reshu");
		list.add(s1);
		return list;*/
		
		Scanner sc=new Scanner(System.in);
		List<Student> list=new ArrayList<>();
		System.out.println("Enter how many students you want to add?");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			Student s=new Student();
			System.out.println("Enter roll no");
			s.setRollno(sc.nextInt());
			System.out.println("Enter name");
			s.setName(sc.next());
			list.add(s);
		}
		return list;


	}

}
