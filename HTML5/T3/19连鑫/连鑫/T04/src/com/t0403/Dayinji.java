package com.t0403;

public class Dayinji implements Mohe , Zhizhang {

	public void info(String mh ,String zz1){
		
		System.out.println("使用"+dy(mh)+"墨盒在"+zz(zz1)+"纸张上打字");
	}
	

	
	public String zz(String zz1) {
		String zz2 = zz1;
		return zz2;
		
	}
	
	
	public String dy(String mh) {
		String mh1=mh;
		return mh;
		
	}
	
}
