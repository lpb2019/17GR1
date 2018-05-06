package com.qinghuaIT;

public class CommonHandset extends Handset implements PlayWiring{
	public void info(String brank,String type){
		super.toString(brank,type);
	}
	public void play(String yinyue) {
		String y=yinyue;
		System.out.println("开始播放音乐"+y+"......");
	}
	public void sendInfo() {
		System.out.println("发送文字信息......");
	}
	public void call() {
		System.out.println("开始语音通话......");
	}
}
