package com.qinghuaIT2;

public class Fdm {
    Gm gm;
    Sm sm;
    Ks ks;
    Km km;
     public void setgm(Gm gm) {
            this.gm = gm;
        }
    public void setsm(Sm sm){
        this.sm=sm;
    }


    public void setks(Ks ks){
        this.ks=ks;
        }

    public void setkm(Km km){
        this.km=km;
        }
    public void print(){
    	System.out.println(""+gm.getgm());
    	System.out.println(""+sm.getsm());
    	System.out.println(""+ks.getks());
    	System.out.println(""+km.getkm());
    }
	
		
}