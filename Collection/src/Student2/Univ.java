package Student2;


import java.util.Iterator;
import java.util.List;

public class Univ {
public static void main(String[] args) {
	College c=new College();
	List<Student> list=c.m1();
	Iterator<Student> itr=list.iterator();
	while(itr.hasNext()){
		Student s=itr.next();
		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}
}
}
