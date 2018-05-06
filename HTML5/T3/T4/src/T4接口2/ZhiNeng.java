package T4接口2;

public class ZhiNeng extends Shouji implements BoFang ,ShangWang,ZhaoXiang {
	public ZhiNeng() {
		super();
	}

	public ZhiNeng(String xinxi, String dianhua) {
		super(xinxi, dianhua);
	}

	@Override
	public void bo(String name) {
		System.out.println("开始播放视频：《"+name+"》......");
	}

	@Override
	public void duan() {
		System.out.println("发送带图片的文字信息。。。。");
	}

	@Override
	public void dianhua() {
		System.out.println("开始视频通话。。。。。");
	}
public void print() {
   System.out.println("这是一款型号为："+super.getXinghao()+"的"+super.getPinpai()+"手机；");
}

@Override
public void zhao() {
	System.out.println("咔嚓.......拍照成功");
}

@Override
public void wang() {
	System.out.println("已经启动移动网络......");
}
}
