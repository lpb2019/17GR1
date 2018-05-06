package li.shoujicom;

public abstract class Handset {

	String brand;
	
	String type;
	
	public abstract void sendInfo();

	public Handset(String brand, String type) {
		super();
		this.brand = brand;
		this.type = type;
	} 
		
	
	
	
	
}
