package Student;

import java.util.ArrayList;
import java.util.List;

public class College {
public List m1(){
	List list=new ArrayList();
	Student s1=new Student();
	s1.setRollno(1);
	s1.setName("vishal");
	Student s2=new Student();
	s2.setRollno(5);
	s2.setName("vicky");
	list.add(s1);
	list.add(s2);
	return list;
}
}
