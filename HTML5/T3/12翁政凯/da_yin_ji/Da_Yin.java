package com.qhit.t04.da_yin_ji;

public  class Da_Yin implements Mo_He,Zhi_Zhang{

//	public void A4() {
//		
//	}
//
//	public void B5() {
//		
//	}
//
//	public void caise() {
//		
//	}
//
//	public void heise() {
//		
//	}

	public static void main(String[] args) {
		Da_Yin d = new Da_Yin();
		System.out.println("使用"+d.heibai+"墨盒在"+d.A4+"纸张上打印");
		System.out.println("使用"+d.caise+"墨盒在"+d.B5+"纸张上打印");
		System.out.println("使用"+d.caise+"墨盒在"+d.A4+"纸张上打印");
		System.out.println("使用"+d.heibai+"墨盒在"+d.B5+"纸张上打印");
	}
}
