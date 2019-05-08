package Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List list=new ArrayList();
	
Student s1=new Student();
s1.setRollno(1);
s1.setName("vishal");

Student s2=new Student();
s2.setRollno(2);
s2.setName("vicky");

list.add(s1);
list.add(s2);

Iterator itr=list.iterator();
while(itr.hasNext()){
	Student s3=(Student)itr.next();
	System.out.println(s3.getRollno());
	System.out.println(s3.getName());
}
}
}
