package com.qhit.t04.Shou_Ji;

public class Handset {
	String type;
	String brand;
	
	public void call(String s) {
		System.out.println("开始"+s);
	}
	public void info(String k) {
		System.out.println("发送"+k);
	}
	
	public void sendlnfo() {
		System.out.println("这是一款型号为"+type+"的"+brand+"手机");
	}

}
