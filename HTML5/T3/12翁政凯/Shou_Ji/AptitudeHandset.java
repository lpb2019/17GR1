package com.qhit.t04.Shou_Ji;

public class AptitudeHandset extends Handset implements Network,TheakePictures,PlayWiring{
	
	
	public void takePictures() {
		System.out.println("咔嚓。。。。。。。。。拍照成功");
	}

	public void networkconn() {
		System.out.println("已经启动移动网络。。。。。。");
	}

	public void play(String in, String content) {
		System.out.println("开始"+in+content);
	}
	
}