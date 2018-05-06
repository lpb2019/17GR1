package com.qhit.shouji;

public class putong extends shouji implements bofang{
	public putong(){
		super();	
	}
	public putong(String xinxi,String dianhua){
		super(xinxi,dianhua);	
	}
	public void bo(String name){
		System.out.println("开始播放音乐《"+name+"》");
	}
	public void dianhua(){
		System.out.println("开始通话");
	}
	public void duan(){
		System.out.println("发送信息");
	}
	public void print(){
		System.out.println("这是一款型号为："+super.getXinghao()+"的"+super.getPinpai()+"手机");
	}

}
