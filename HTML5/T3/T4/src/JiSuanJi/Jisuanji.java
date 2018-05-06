package JiSuanJi;

public class Jisuanji extends Cpu implements Neicun,Yingpan{

	public Jisuanji(String pingpai, String zhuping) {
		super(pingpai, zhuping);
	}

	@Override
	public void print() {
		System.out.println(super.toString());
	}

	@Override
	public void rongliang() {
		System.out.println("硬盘容量为："+yin);
	}

	@Override
	public void liang() {
		System.out.println("内存容量为："+Nyin);
		
	}

}
