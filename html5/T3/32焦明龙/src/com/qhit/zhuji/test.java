package com.qhit.zhuji;


public abstract class test extends zhuji implements jsj,yingpan,neicun{

	public void HardDisk(String rongliang) {
		System.out.println("4GB");
	}

	public void ems(String rong) {
		System.out.println("3000GB");
		
	}

	public void cpu(String pinpai, String zhupin){
		System.out.println("inter"+"3.8GHz");
		
	}
	public static void main(String[] args) {
		System.out.println("计算机信息如下:");
		test t = new test();
		t.cpu("", "");
		t.Ha("");
		t.HD("");
		
	}
	

}

