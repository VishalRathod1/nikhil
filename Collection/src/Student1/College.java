package Student1;

import java.util.ArrayList;
import java.util.List;

public class College {
public List m1(){
	List eng=new ArrayList();
	List fe=new ArrayList();
	List se=new ArrayList();
	Student s1=new Student();
	s1.setRollno(1);
	s1.setName("vishal");
	Student s2=new Student();
	s2.setRollno(2);
	s2.setName("vicky");
	Student s3=new Student();
	s3.setRollno(3);
	s3.setName("aruna");
	Student s4=new Student();
	s4.setRollno(4);
	s4.setName("reshu");
	fe.add(s1);
	fe.add(s2);
	se.add(s3);
	se.add(s4);
	eng.add(fe);
	eng.add(se);


	return eng;
}
}
