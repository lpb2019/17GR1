package com.qinghuaIT3;

public class Jsj {

	 Cpu cpu;
	    Ems ems;
	    HardDisk harddisk;
	     public void setCpu(Cpu cpu) {
	            this.cpu = cpu;
	        }
	    public void setEms(Ems ems){
	        this.ems=ems;
	    }


	    public void steHardDisk(HardDisk harddisk){
	        this.harddisk=harddisk;
	        }
	    public void print(){
	    	System.out.println("Cpu的品牌是："+cpu.getPp()+",主频是："+cpu.getZp());
	    	System.out.println("硬盘容量是"+harddisk.getRl());
	    	System.out.println("内存容量是"+ems.getRl1());
	    }
}
