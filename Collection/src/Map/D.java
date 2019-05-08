package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class D {
public static void main(String[] args) {
	List<String> mh=new ArrayList<>();
	mh.add("pune");
	mh.add("mumbai");
	//System.out.println(mh);
	List<String> rj=new ArrayList<>();
	rj.add("jaipur");
	rj.add("jodhpur");
	
	Map<String,List<String>> indiam=new HashMap<>();
	indiam.put("maharashtra",mh);
	indiam.put("rajasthan",rj);
	
	List<String> ca=new ArrayList<>();
	ca.add("los angeles");
	ca.add("san fransisco");
	
	List<String> tx=new ArrayList<>();
	tx.add("austin");
	tx.add("houston");
	
	Map<String,List<String>> usam=new HashMap<>();
	usam.put("california",ca);
	usam.put("texas",tx);

	Map<String,Map<String,List<String>>> worldm=new HashMap<>();
	worldm.put("india",indiam);
	worldm.put("usa",usam);
	
	System.out.println(worldm);
	Set<String> keys=worldm.keySet();
	Iterator<String> itr=keys.iterator();
	while(itr.hasNext()){
		String s=itr.next();
		System.out.println(s);
		Map<String,List<String>> india1=worldm.get(s);
		Set<String> keys1=india1.keySet();
		Iterator<String> itr1=keys1.iterator();
		while(itr1.hasNext()){
			String s1=itr1.next();
			System.out.println(s1);
			List<String> keys2=india1.get(s1);
			Iterator<String> itr2=keys2.iterator();
			while(itr2.hasNext()){
				String s2=itr2.next();
				System.out.println(s2);
			}
			}
	}
}
}
