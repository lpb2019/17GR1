package mt;

public class Putong extends sj implements Bofang{
public Putong(){
	super();
}
public  Putong (String xinxi,String dianhua){
	super(xinxi,dianhua);
}
	@Override
	public void bl(String name) {
		// TODO Auto-generated method stub
		System.out.println("开始播放音乐《"+name+"》");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("这是一款型号为"+super.getXinghao()+super.getPinpai()+"手机" );
	}

	@Override
	public void dian() {
		// TODO Auto-generated method stub
		System.out.println("开始发送文字短信");
	}

	@Override
	public void dianhua() {
		// TODO Auto-generated method stub
	System.out.println("开始打电话");	
	}

}
