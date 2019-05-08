package Student1;

import java.util.Iterator;
import java.util.List;

public class Univ {
public static void main(String[] args) {
	College c=new College();
	List list=c.m1();
	Iterator itr=list.iterator();
	while(itr.hasNext()){
		List list1=(List)itr.next();
		Iterator itr1=list1.iterator();
		while(itr1.hasNext()){
			Student s=(Student)itr1.next();
			System.out.println(s.getRollno());
			System.out.println(s.getName());
		}
	}
}
}
