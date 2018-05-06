package com.qhit.dyj;


public class Dyj {	
	Mbox m;
	Per p;
	public Mbox getM() {
		return m;
	}
	public void setM(Mbox m) {
		this.m = m;
	}
	public Per getP() {
		return p;
	}
	public void setP(Per p) {
		this.p = p;
	}
		public void show(){
		
		System.out.println("ÎÒÊÇ"+p.getSize()+"Ö½"+m.getColor()+"Ä«ºÐ");
		
	}

}

