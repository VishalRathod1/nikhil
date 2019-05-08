package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {
public static void main(String[] args) {
	/*List l=new ArrayList();
	l.add(5);
	l.add(10);
	l.add(20);
	l.add(40);
	l.add("xyz");
    l.add(10);
    //l.removeAll(l);
    //l.remove(2);
    //l.retainAll(l);
    //l.size();
    //l.clear();
    //l.contains(l);
    //l.toArray();
    //l.iterator();
    //l.equals(l);
    //l.stream();
    //l.hashCode();
    Iterator itr=l.iterator();
    while(itr.hasNext()){
    	System.out.println(itr.next());
    }*/
	
	
	List list=new ArrayList<>();
	list.add("abc");
	list.add("pqr");
	list.add(5);
	list.add("xyz");
	list.add(10);
	
	Iterator itr=list.iterator();
	while(itr.hasNext()){
		Object o=itr.next();
		if(o instanceof String){
			String s=(String)o;
			System.out.println(s);
		}
		else if(o instanceof Integer){
			Integer i=(Integer)o;
			System.out.println(i);
		}
	}
}
}
