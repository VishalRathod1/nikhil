package World;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Employee.Employee;
import Student1.Student;

public class StudentEmployee {
public static void main(String[] args) {
	Employee e1=new Employee();
	Student s1=new Student();
	List m=new ArrayList();
	m.add(e1);
	m.add(s1);
	List l=new ArrayList();
	l.add(s1);
	l.add(m);
	List k=new ArrayList();
	k.add("c");
	k.add(l);
	List j=new ArrayList();
	j.add("b");
	j.add(k);
	List a1=new ArrayList();
	a1.add("a");
	a1.add(j);
	System.out.println(a1);
	
	Iterator itr=a1.iterator();
    while(itr.hasNext()){
    	Object o=itr.next();
    	if(o instanceof String){
    		System.out.println(o);
    	}
    	if(o instanceof List)
    	{
    		List a=(List)o;
    		Iterator itr1=a.iterator();
    		while(itr1.hasNext()){
    			Object o1=itr1.next();
    			if(o1 instanceof String){
    	    		System.out.println(o1);
    	    	}
    	    	if(o1 instanceof List){
    	    		List b=(List)o1;	
    	    		Iterator itr2=b.iterator();
    	    		while(itr2.hasNext()){
    	    			Object o2=itr2.next();
    	    			if(o2 instanceof String){
    	    	    		System.out.println(o2);
    	    	    	}
    	    	    	if(o2 instanceof List){
    	    	    		List c=(List)o2;
    	    	    		Iterator itr3=c.iterator();
    	    	    		while(itr3.hasNext()){
    	    	    			Object o3=itr3.next();
    	    	    			if(o3 instanceof Student){
    	    	    	    		System.out.println(o3);
    	    	    	    	}
    	    	    	    	if(o3 instanceof List){
    	    	    	    		List d=(List)o3;	
    	    	    	    		Iterator itr4=d.iterator();
    	    	    	    		while(itr4.hasNext()){
    	    	    	    			Object o4=itr4.next();
    	    	    	    			if(o4 instanceof Employee){
    	    	    	    	    		System.out.println(o4);
    	    	    	    	    	}
    	    	    	    	    	if(o4 instanceof Student){
    	    	    	    	    		System.out.println(o4);	
    	    	    	    	    		
    	    	    	    	    	}
    	    	    	    	}
    	    	    		
    	    	    	}
    	    	}
    		}
    	}
    	}
    	
    }
}
}
}
}