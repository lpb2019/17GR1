package com.t02;

public class Test {
	public static void main(String[] args) {
		
		CommonHandset ch = new CommonHandset();
		AptitudeHandset ah = new AptitudeHandset();
		ch.info("G502c","索尼");
		ch.sendInfo();
		ch.call();
		ch.play("《热雪》");
		ah.info("HTC", "I9100");
		ah.nteworkConn();
		ah.play("《小时代》");
		ah.takePictures();
		ah.sendInfo();
		ah.call();
	}
}
