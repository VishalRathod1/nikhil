package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap<>();
	m.put(5, "CJC");
	m.put(10, "C");
	m.put(15, "C++");
	m.put(20, "C#");
    //m.put(5, "JAVA");
	System.out.println(m);
    //String s=(String)m.get(10);
    //System.out.println(s);
	Set<Integer> keys=m.keySet();
	System.out.println(keys);
	Iterator<Integer> itr=keys.iterator();
	while(itr.hasNext()){
		int key=itr.next();
		System.out.println(key);
		String s1=(String)m.get(key);
		System.out.println(s1);
	}
}
}
