package Employee;

import java.util.Scanner;

//import operation.Operation;

public class Test {
	public static void main(String[] args) {
		System.out.println("Welcome to Infosys");

		//System.out.println("1.Add Employee");
		//System.out.println("2.Display Details");
		
		Operation op=new Operation();
		Scanner sc=new Scanner(System.in);
		while(true){
	    System.out.println("Enter your Choice");
		int ch=sc.nextInt();
		
		switch(ch){
		case 1:
			op.AddEmployee();
			break;
		case 2:
			op.DisplayDetails();
			break;
		case 3:
			op.SearchEmployee();
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}
		}

	}
}
