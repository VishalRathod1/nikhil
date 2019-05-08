package Country;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {
public static void main(String[] args) {
	
	List mh=new ArrayList();
	mh.add("Pune");
	mh.add("Mumbai");
	mh.add("solapur");
	
	List rj=new ArrayList();
	rj.add("Jaipur"); 
	rj.add("Jodhpur");
	
	List india=new ArrayList();
	india.add(mh);
	india.add(rj);
    
   Iterator itr=india.iterator();
    while(itr.hasNext()){
    	List list=(List)itr.next();
    	Iterator itr1=list.iterator();
    	while(itr1.hasNext()){
    		String s=(String)itr1.next();
    	System.out.println(s);

   
    
}
}
}
}
