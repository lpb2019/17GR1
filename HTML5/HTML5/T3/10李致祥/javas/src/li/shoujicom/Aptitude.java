package li.shoujicom;

public class Aptitude  extends Handset implements Thack,Network,Play{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("1111111111111111111111111");
	}

	@Override
	public void net() {
		// TODO Auto-generated method stub
		System.out.println("1111111111111111111111111");
	}

	@Override
	public void thack() {
		// TODO Auto-generated method stub
		System.out.println("1111111111111111111111111");
	}

	@Override
	public void sendInfo() {
		System.out.println(""+brand+"  "+type+"");
	}

	public Aptitude(String brand, String type) {
		super(brand, type);
	}
	
	

}
