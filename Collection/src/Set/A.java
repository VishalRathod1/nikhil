package Set;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class A {
public static void main(String[] args) {
	/*Set s=new HashSet();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	System.out.println(s);
	Iterator itr=s.iterator();
	while(itr.hasNext()){
		int x=(int)itr.next();
		System.out.println(x);
	}
	
	.........................................
	Set<String> s=new HashSet<>();
	s.add("abc");
	s.add("pqr");
	s.add("jkl");
	System.out.println(s);
	Iterator<String> itr=s.iterator();
	while(itr.hasNext()){
		String s1=itr.next();
		System.out.println(s1);
	}
	
	.........................................
	for(String s2:s){
		System.out.println(s2);
	}
	
	//how to remove duplicate element fron the list?
			
	ArrayList list=new ArrayList();
	list.add(5);
	list.add(5);
	list.add(10);
	list.add(10);
	list.add(15);
	list.add(20);
	System.out.println(list);
	Set s=new HashSet(list);  //insertion order not followed
	System.out.println(s);
	Set s1=new LinkedHashSet(list);  //insertion order followed
	System.out.println(s1);
			
	.........................................
			//how to sort list without duplicate element
			
	ArrayList list=new ArrayList();
	list.add(10);
	list.add(1);
	list.add(5);
	list.add(2);
    list.add(5);
    Set s=new TreeSet(list);
    System.out.println(s);

.....................................................
*/
//how to sort list with duplicate element

	ArrayList list=new ArrayList();
	list.add(10);
	list.add(1);
	list.add(5);
	list.add(2);
    list.add(5);
    Collections.sort(list);
    System.out.println(list);
	
}
}