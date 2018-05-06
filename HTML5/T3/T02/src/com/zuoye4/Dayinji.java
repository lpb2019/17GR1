package com.zuoye4;

public class Dayinji implements Box,Paper {

	@Override
	public void zhi(String b) {
		// TODO Auto-generated method stub
		
		System.out.println("在"+b+"纸张上打印");
		
	}

	@Override
	public void bo(String a) {
		// TODO Auto-generated method stub
		System.out.print("使用"+a);
	}

	
	
}
