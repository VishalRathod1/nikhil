package Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Operation implements Operation1 {
List l=new ArrayList();
Scanner sc=new Scanner(System.in);


	public void AddEmployee() {
		Employee e=new Employee();
		System.out.println("Enter Employee ID");
		e.setId(sc.nextInt());
		System.out.println("Enter Employee Name");
		e.setName(sc.next());
		System.out.println("Enter Employee Designation");
		e.setDesignation(sc.next());
		System.out.println("Enter Employee Address");
		e.setAddress(sc.next());
		l.add(e);
	
	}

	
	public void DisplayDetails() {
		Iterator itr=l.iterator();
		while(itr.hasNext()){
			Employee emp=(Employee)itr.next();
		
		
		System.out.println("Employee ID:-"+emp.getId());
		System.out.println("Employee Name:-"+emp.getName());
		System.out.println("Employee Designation:-"+emp.getDesignation());
		System.out.println("Employee Address:-"+emp.getAddress());
		}
	}
	
	public void SearchEmployee(){
		System.out.println("Enter employee ID");
		
		
}
	

}