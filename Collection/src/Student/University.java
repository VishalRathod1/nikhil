package Student;

import java.util.Iterator;
import java.util.List;

public class University {
public static void main(String[] args) {
	College c=new College();
	List list=c.m1();
	Iterator itr=list.iterator();
	while(itr.hasNext()){
		Student s=(Student)itr.next();
		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}
}
}
