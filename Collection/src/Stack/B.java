package Stack;

import java.util.List;
import java.util.Stack;

public class B {
public static void main(String[] args) {
	List l=new Stack();
	((Stack) l).push("A");
	((Stack) l).push("B");
    ((Stack) l).push(10);

	System.out.println(l);
}
}
