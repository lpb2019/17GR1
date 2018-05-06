package com.t02;

//普通手机
public class CommonHandset extends Handset implements PlayWiring {
	


	

	public void info(String type, String brand) {
		super.toString(type, brand);
	}
	
	public void sendInfo() {
		System.out.println("发送文字信息···");
	}
	public void call() {
		System.out.println("开始语音通话···");
	}


	public void play(String dianying) {
		String s = dianying;
		System.out.println("播放音乐"+s+"中···");
	}

	
	
	
}
