package com.zuoye5;

public class Jisuanji implements Cup,Neicun,Yingpan{

	@Override
	public void ying(String daxiao) {
		// TODO Auto-generated method stub
		System.out.println("硬盘大小为："+daxiao);
	}

	@Override
	public void cun(String rong) {
		// TODO Auto-generated method stub
		System.out.println("内存大小："+rong);
	}

	@Override
	public void cup(String pin, String zhupin) {
		// TODO Auto-generated method stub
		System.out.println("计算机的品牌是"+pin+"主频是："+zhupin);
	}

	
	
	
	
}
