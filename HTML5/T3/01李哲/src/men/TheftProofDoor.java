package men;

public class TheftProofDoor extends Door implements Locker,DoorBell{

	public String lock() {
		return "锁上了";

	}

	public String unlock() {
		return "锁打开了";
	}
	
	public String doorBell() {
		return "铃";
	}
	

	public static void main(String[] args){
		TheftProofDoor t = new TheftProofDoor();
		System.out.println( t.close());
		System.out.println(t.lock());
		System.out.println(t.doorBell());
		System.out.println(t.unlock());
		System.out.println(t.open());
		
		
		
		
	}
	
	
	
}
