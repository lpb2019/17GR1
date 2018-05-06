package com.qhit.t04.Ji_Suan_JI;

public class Ji_suan_ji implements CPU,EMS,HardDisk {

	public String hardDisk(String h) {
		
		return "硬盘容量是："+h;
	}

	public String ems(String e) {
		
		return "内存容量是："+e;
	}

	public String cpu(String c, String p) {
		
		return "CPU的品牌是：" +c+ ",主频是："+p;
	}

	
	public static void main(String[] args) {
		Ji_suan_ji j = new Ji_suan_ji();
		System.out.println(j.cpu("Intel", "3.8GHz"));
		System.out.println(j.hardDisk("3000GB"));
		System.out.println(j.ems("4GB"));
	}
}
