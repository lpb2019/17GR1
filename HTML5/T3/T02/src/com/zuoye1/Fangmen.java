package com.zuoye1;

public class Fangmen extends Men implements Suo,Pai{

	public void kaimen() {
		System.out.println("轻轻拉门，门开了");
	}
	public void zhao() {
		System.out.println("咔---咔---照片以储存");
	}
	public void guanmen() {
		System.out.println("轻轻推门，关门了");
	}
	
	public void kaisuo() {
		System.out.println("左三圈，锁开了");

	}
	public void guansuo() {
		System.out.println("右三圈，锁上了");

	}
}
