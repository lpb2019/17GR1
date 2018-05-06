package com.t0404;

public class Computers extends Computer implements Ems , Harddisk{

	
	void pinpai(String pp, String zp) {
		// TODO Auto-generated method stub
		System.out.println("计算机信息如下：");
		System.out.println("CPU的品牌是:"+pp+"    "+"主频是:"+zp);
	}

	
	public void rl1(String gb1) {
		// TODO Auto-generated method stub
		System.out.println("硬盘容量是:"+gb1);
	}
	
	public void rl(String gb) {
		// TODO Auto-generated method stub
		System.out.println("内存容量是:"+gb);
	}

}
