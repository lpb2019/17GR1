package auoye;

public class text extends lei implements jisuanjiyi,yingpan,neicun{

	public void HardDisk(String rongliang) {
		System.out.println("4GB");
	}

	public void ems(String rong) {
		System.out.println("3000GB");
		
	}

	public void cpu(String pinpai, String zhupin){
		System.out.println("INTER"+"3.8GHz");
		
	}
	public static void main(String[] args) {
		System.out.println("计算机信息如下:");
		text aa=new text();
		aa.cpu("", "");
		aa.ems("");
		aa.HardDisk("");
		
	}
	

}
