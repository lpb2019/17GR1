package shouji;

public class Sj extends Shouji implements Paizhao, Wangluo,
Bofang {

	public Sj(String brand, String type) {
		super("htc", "I9100");
	}

	public void bofang1() {
		System.out.println("开始播放《热雪》......");
	}

	public void wangluo() {

		System.out.println("已经启动移动网络......");
	}

	public void paizhao() {
		System.out.println("咔嚓......拍照成功");
	}

	public static void main(String[] args) {

		Sj tpd = new Sj("G502c", "索尼爱立信");
		tpd.setBrand("G502c");
		tpd.setType("索尼爱立信");

		tpd.Info();

		tpd.call();
		tpd.sendInfo();
		tpd.bofang();

		Sj tpd1 = new Sj("htc", "I9100");
		tpd1.setBrand("htc");
		tpd1.setType("I9100");
		tpd1.Info();
		tpd1.bofang1();
		tpd.paizhao();
		tpd.wangluo();
	}

	@Override
	public void bofang() {
		System.out.println("开始播放音乐了......");

	}


}
