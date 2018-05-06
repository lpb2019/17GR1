package com.qinghuaIT3;

public class Test {

	public static void main(String[] args) {
	    System.out.println("计算机的信息如下：");
	    
	    Jsj j=new Jsj();
	    j.setCpu(new Zjcs());
	    j.setEms(new Zjcs());
	    j.steHardDisk(new Zjcs());
	    j.print();
	}
}
