package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C {
public static void main(String[] args) {
	List<String> s=new ArrayList<>();
	s.add("A");
	s.add("B");
	List<String> s1=new ArrayList<>();
	s1.add("Pune");
	s1.add("Mumbai");
	Map<String,List<String>> m=new HashMap<>();
	m.put("Vishal", s);
	m.put("Rathod", s1);
	System.out.println(m);
	
Set<String> keys=m.keySet();
System.out.println(keys);
Iterator<String> itr=keys.iterator();
while(itr.hasNext()){
	String key=itr.next();
	System.out.println(key);
	List<String> val=m.get(key);
	//System.out.println(val);
	Iterator<String> itr1=val.iterator();
	while(itr1.hasNext()){
		String s2=itr1.next();
		System.out.println(s2);
	}
	
}
}
}
