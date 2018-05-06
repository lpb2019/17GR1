package com.zuoye3;

public class Zhineng extends Souji implements Zhaoxiang,Bofang,Wangluo{

	@Override
	public void faduanxin() {
		// TODO Auto-generated method stub
		System.out.println("发信息");

	}
	public void wang() {
		System.out.println("正在打开5G网络");
	}
	@Override
	public void dadianhua() {
		// TODO Auto-generated method stub
		System.out.println("打电话");
	}
	
	public void zhao() {
		System.out.println("咔---咔---拍照成功");
	}
	public void bo() {
		System.out.println("视频播放中 -----笑傲江湖");
	}
}
