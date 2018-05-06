package com.qhit.fangdaomen;

public class fangdaomen extends door implements locker,zhaoxiang{

	public String lock() {
		return "门锁了";
	}
	public String unlock() {
		return "门锁开了";
	}
	public String zhao(){
		return "咔嚓。。。。照相成功";
	}

	public static void main(String[] args){
		fangdaomen fdm = new fangdaomen();
		System.out.println( fdm.close());
		
		System.out.println(fdm.lock());
		System.out.println(fdm.zhao());
		
		System.out.println(fdm.unlock());
		System.out.println(fdm.open());
		
		
		
		
	}
	

	
	
	
	
	
}