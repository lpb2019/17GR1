package T4接口2;

public class Putong extends Shouji implements BoFang{

	public Putong() {
		super();
	}

	public Putong(String xinxi, String dianhua) {
		super(xinxi, dianhua);
	}

	@Override
	public void bo(String name) {
		System.out.println("开始播放音乐《"+name+"》......");
	}

	@Override
	public void duan() {
		System.out.println("发送文字信息。。。。");
	}

	@Override
	public void dianhua() {
		System.out.println("开始语音通话。。。。。");
	}
public void print() {
   System.out.println("这是一款型号为："+super.getXinghao()+"的"+super.getPinpai()+"手机；");
}

}
