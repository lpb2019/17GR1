package com.qinghuaIT;

public class AptitudeHandset extends Handset implements Network,PlayWiring,TheakePictures{
	public void info(String brank,String type){
		super.toString(brank,type);
	}
	public void networkConn() {
		System.out.println("已经启动移动网络......");
	}
	public void play(String yinyue) {
		String y=yinyue;
		System.out.println("开始播放视频"+y+"......");
	}
	public void takePictures() {
		System.out.println("咔擦......拍照成功");
	}
	public void sendInfo() {
		System.out.println("发送带图片和文字的信息......");
	}
	public void call() {
		System.out.println("开始语音通话......");
	}
}
