package jsj;

public class dn {
	cpu c;
	ems e;
	hr h;
	public hr getH() {
		return h;
	}
	public void setH(hr h) {
		this.h = h;
	}
	public cpu getC() {
		return c;
	}
	public void setC(cpu c) {
		this.c = c;
	}
	public ems getE() {
		return e;
	}
	public void setE(ems e) {
		this.e = e;
	}
	
public void show(){
		System.out.println("计算机的信息如下：");
		System.out.println("Cpu的品牌是:"+c.getCPUXinghao());
		System.out.println("主频是:"+c.getCPUzhupin());
		System.out.println("硬盘的容量:"+h.getHDronliang());
		System.out.println("内存的容量是:"+e.getEMSname());
	}
}
