package shouji;

public class zhineng implements kacha ,Network,shirtemile,tell ,playWiring{

	@Override
	public void tell() {
		// TODO Auto-generated method stub
		System.out.println("开始视频通话");
	}

	@Override
	public void shirtemile() {
		// TODO Auto-generated method stub
		System.out.println("开始发送带文字和图片的短信");
		
	}

	@Override
	public void Network() {
		// TODO Auto-generated method stub
		System.out.println("连接网络");
		
	}

	@Override
	public void kacha() {
		// TODO Auto-generated method stub
		System.out.println("咔嚓。。。。。照相成功");
		
	}

	public void playWiring() {
		// TODO Auto-generated method stub
		System.out.println("开始播放视频《大上海》");
		
	}
	public void zhineng(){
		System.out.println("这是一款HTC的T9100的手机");
	}
}