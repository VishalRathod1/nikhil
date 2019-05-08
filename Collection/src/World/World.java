package World;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World {
public static void main(String[] args) {
	List mh=new ArrayList();
	mh.add("Pune");
	mh.add("Mumbai");

	List rj=new ArrayList();
	rj.add("Jaipur");
	rj.add("Jodhpur");

	List ca=new ArrayList();
	ca.add("Los Angeles");
    ca.add("San Francisco");

	List tx=new ArrayList();
	tx.add("Austin");
	tx.add("Houston");

	List india=new ArrayList();
	india.add(mh);
	india.add(rj);
	
	List usa=new ArrayList();
	usa.add(ca);
	usa.add(tx);
	
	List world=new ArrayList();
	world.add(india);
	world.add(usa);
	
	//System.out.println(world);
	
	Iterator itr=world.iterator();
    while(itr.hasNext()){
    	List india1=(List)itr.next();
    	Iterator itr1=india1.iterator();
    	while(itr1.hasNext()){
    		List mh1=(List)itr1.next();
        	Iterator itr2=mh1.iterator();
        	while(itr2.hasNext()){
        		String s=(String)itr2.next();
        		System.out.println(s);
}
}
}
}
}
