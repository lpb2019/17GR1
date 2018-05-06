package com.theftproofdoor;

public class TheftProofDoor extends Door implements Locker,photo{

	public String lock() {
		return "锁门了";

	}

	public String unlock() {
		// TODO Auto-generated method stub
		return "开门了";
	}

	public static void main(String[] args){
		TheftProofDoor tpd = new TheftProofDoor();

		System.out.println(tpd.close());
		System.out.println(tpd.lock());
		System.out.println(tpd.unlock());
		System.out.println(tpd.open());
		System.out.println(tpd.pz());

	}

	@Override
	public String pz() {
		
		return "咔嚓......拍照成功";
	}

	
	
	
}
