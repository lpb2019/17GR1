package computer;

public class computer {
	public void Print(CPU p){
		System.out.println("CPU的品牌是："+p.mather()+"主频是："+p.zhupin());
	}
	public void print1(HHD h){
		System.out.println("硬盘的容量是："+h.TD());
	}
	public void print2(Nc n){
		System.out.println("内存大小："+n.neicun());
		
	}
	public static void main(String[] args) {
		computer c =new computer();
		c.Print(new Inter());
		c.print1(new Td());
		c.print2(new Bnc());
		
	}

}
