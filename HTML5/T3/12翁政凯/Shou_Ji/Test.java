package com.qhit.t04.Shou_Ji;

public class Test {
	
	public static void main(String[] args) {
		CommoHandset c = new CommoHandset();
		c.brand="G502c";
		c.type="索尼娅立信";
		c.sendlnfo();
		c.play("播放音乐","《热雪》");
		c.call("语音通话.....");
		c.info("文字信息.....");
		
		System.out.println("\n");
		
		AptitudeHandset a = new AptitudeHandset();
		a.brand="HTC";
		a.type="I9100";
		a.sendlnfo();
		a.networkconn();
		a.play("播放视频","《小时代》....");
		a.takePictures();
		a.call("视屏通话。。。。。。。。.");
		a.info("带图片与文字的信息。。。。。");
		
	}
	
}
