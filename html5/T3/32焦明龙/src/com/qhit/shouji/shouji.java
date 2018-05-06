package com.qhit.shouji;

public abstract class shouji {
	private String xinghao;
	private String pinpai;
	
	public shouji(String xinghao,String pinpai){
		super();
		this.pinpai = pinpai;
		this.xinghao = xinghao;
	}
	public String getXinghao() {
		return xinghao;
	}
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	public String getPinpai() {
		return pinpai;
	}
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	public shouji() {
		super();
	}
	public abstract void print();
	public abstract void duan();
	public abstract void dianhua();
	
}
