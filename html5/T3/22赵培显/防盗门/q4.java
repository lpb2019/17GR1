package jieklou;

public class q4 extends q2 implements q1 {

	public void kai() {
		System.out.println("开门");
		
	}

	public void zhaoxiang() {
		System.out.println("咔...嚓...照片已储存");
	}

	public void guan() {
		System.out.println("关门");
	}
	public static void main(String[] args) {
		q4 s1=new q4();
	  s1.kai();
	  s1.zhaoxiang();
	  s1.guan();
				
		
	}

}
