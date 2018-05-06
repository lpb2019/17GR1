package com.qhit.dyj;


import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		Mbox b=new HB();
		Mbox c=new CS();
		Per a1=new A1z();
		Per b5=new B5z();
		Dyj d=new Dyj();
		d.show();
		Scanner sc=new Scanner(System.in);
		System.out.println("请选择打印机类型：1.彩色，2.黑白");
			String next=sc.next();
			if (next.equals("1")) {
				d.setM(c);
			} else if(next.equals("2")) {
				d.setM(b);
			}else{
				System.out.println("输入错误");
			}
				
			
		
	}
}

