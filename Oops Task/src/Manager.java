
public class Manager extends Employee implements Bonus{

	
	
	
	private int teamSize;
	
	Manager(String id, String name,int teamSize) {
		super(id, name);
		this.teamSize=teamSize;
		
	}
	
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("programmingLanguage : "+ this.teamSize);
	}
	

	@Override
	public void calculateBonus() {
		System.out.println("20 % bonus ");
	}
	
	
}
