package com.qhit.shouji;

public class zhineng extends shouji implements bofang,shangwang,zhaoxiang {
	public zhineng(){
		super();
	}
	public zhineng(String xinxi,String dianhua){
		super(xinxi,dianhua);
	}
	public void duan(){
		System.out.println("发送消息");
	}
	public void dianhua(){
		System.out.println("开始视频通话");
	}
	public void bo(String name){
		System.out.println("开始播放视频《"+name+"》");
	}
	public void print(){
		System.out.println("这是一款型号为："+super.getXinghao()+"的"+super.getPinpai()+"手机");
	}
	public void zhao(){
		System.out.println("咔嚓。。。。照相成功");
	}
	public void wang(){
		System.out.println("已经启动网络");
	}

}
