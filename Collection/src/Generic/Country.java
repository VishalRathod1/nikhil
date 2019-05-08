package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country {
public static void main(String[] args) {
	List<String> mh=new ArrayList<>();
	mh.add("Pune");
	mh.add("Mumbai");
	List<String> rj=new ArrayList<>();
	rj.add("Jaipur");
	rj.add("Jodhpur");
	List<List<String>> india=new ArrayList<>();
	india.add(mh);
	india.add(rj);
	//System.out.println(india);
	Iterator<List<String>> itr= india.iterator();
	while(itr.hasNext()){
		List<String> list=itr.next();
		Iterator<String> itr1=list.iterator();
		while(itr1.hasNext()){
			String s=itr1.next();
			System.out.println(s);
		}
	}
}
}
