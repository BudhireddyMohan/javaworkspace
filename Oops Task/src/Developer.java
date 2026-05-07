
public class Developer  extends Employee implements Bonus{
  
	
	private String programmingLanguage;
	Developer(String name,String id,String programmingLanguage){
		super(id,name);
		this.programmingLanguage=programmingLanguage;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("programmingLanguage : "+ this.programmingLanguage);
	}

	
	
	@Override
	public void calculateBonus() {
		System.out.println("10 % bonus ");
		
	}
}
