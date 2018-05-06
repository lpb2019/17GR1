package com.t02;

public abstract class Handset {
	
	String brand;//手机商标
	String type;//手机类型
	
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	
	public void toString(String type,String brand) {
		System.out.println("这是一款型号为" + type + "的" + brand + "手机"); 
	}
	//发信息
	public abstract void sendInfo();
	//打电话
	public abstract void call();
	//播放
	
}
