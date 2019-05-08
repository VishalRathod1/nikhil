package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class B {
public static void main(String[] args) {
	Map<String,String> m=new HashMap();
	m.put("A", "JAVA");
	m.put("B", "C++");
	m.put("C", "C");
	Set<String> keys=m.keySet();
	Iterator<String> itr=keys.iterator();
	while(itr.hasNext()){
		String key=itr.next();
		System.out.println(key);
		String val=m.get(key);
		System.out.println(val);
	}
	
}
}
