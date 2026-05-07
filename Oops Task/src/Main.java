import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Employee> a= new ArrayList<>();
		System.out.println("enter the number employee : ");
		int numberofemployee = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<numberofemployee;i++) {
				System.out.println("enter the type of employee");
				System.out.println(" 1 - developer");
				System.out.println(" 2- Manager");
				int emptype=sc.nextInt();
				sc.nextLine();
				
				System.out.println("enter emp name : ");
				String name=sc.nextLine();
				System.out.println("enter emp id : ");
				String id=sc.nextLine();
				
				switch(emptype) {
				   
				case 1:{
					System.out.println("enter the programing language : ");
					String pro=sc.nextLine();
					a.add(new Developer(name,id,pro));
					break;
				}
				
				case 2: {
					System.out.println("enter the no team numbers : ");
					int teamnumber=sc.nextInt();
					a.add(new Manager(name,id,teamnumber));
					break;
				}
				
				default:{
					System.out.println("enter the valid details");
				}
				
				}
				
		}
		
		
		for(int i=0;i<a.size();i++) {
			a.get(i).displayDetails();
			Bonus b=(Bonus) a.get(i);
			b.calculateBonus();
		}
		
		
		
		
	}
}
