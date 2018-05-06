package com.t02;

public class AptitudeHandset extends Handset implements PlayWiring , TheakePictures , Network {
	
	//链接网络
	public void takePictures() {
		System.out.println("咔嚓···照相成功");
		
	}
	//播放
	public void play(String dianying) {
		String sw  =  dianying;
		System.out.println("播放视频"+sw+"中···");
		
	}
	//照相
	public void nteworkConn() {
		System.out.println("已经启动网络");
		
	}



	
	public void info(String type,String brand) {
		super.toString(type, brand);
		
	}
	public void sendInfo() {
		System.out.println("发送带图片与文字的信息···");
	}
	public void call() {
		System.out.println("开始视频通话···");
	}

}
