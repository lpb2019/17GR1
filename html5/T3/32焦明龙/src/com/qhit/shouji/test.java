package com.qhit.shouji;

public class test {
	public static void gai(shouji s) {
		if (s instanceof putong) {
			putong k = (putong) s;
			k.duan();
			k.dianhua();
			k.bo("xxx");
		} else if (s instanceof zhineng) {
			zhineng z = (zhineng) s;
			z.bo("mmm");
			z.wang();
			z.zhao();
			z.dianhua();
			z.duan();
		}
	}
	public static void main(String[] args) {
		shouji p = new putong("hsgf","诺基亚");
		p.print();
		gai(p);
		System.out.println();
		System.out.println("\n\n");
		System.out.println();
		System.out.println();
		shouji z= new zhineng("P20","华为");
		z.print();
		gai(z);
	}

}
