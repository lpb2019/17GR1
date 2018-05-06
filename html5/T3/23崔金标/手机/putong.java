package shouji;

public class putong implements playWiring ,shirtemile,tell {

	@Override
	public void tell() {
		// TODO Auto-generated method stub
		System.out.println("开始语音通话");
		
	}

	@Override
	public void shirtemile() {
		// TODO Auto-generated method stub
		System.out.println("开始发送短信");
		
	}

	@Override
	public void playWiring() {
		// TODO Auto-generated method stub
		System.out.println("开始播放音乐《捉泥鳅》");
		
	}
	public void putong(){
		System.out.println("这是一款型号为G502c的索尼爱立信手机");
	}

}
