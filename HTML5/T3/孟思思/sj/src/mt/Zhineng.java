package mt;

public class Zhineng extends sj implements Shangwang,Bofang,Zhaoxiang{
private static final String name = null;

public Zhineng(){
	super();
}
public Zhineng(String xinxi,String dianhua){
	super(xinxi,dianhua);
}
public void bl(String name) {
	// TODO Auto-generated method stub
	System.out.println("开始播放视频：《"+name+"》...");
}
public void dian() {
	// TODO Auto-generated method stub
	System.out.println("发送带文字的图片");
}
public void dianhua() {
	// TODO Auto-generated method stub
	System.out.println("开始视频通话");
}
public void print() {
	// TODO Auto-generated method stub
	System.out.println("这是一款型号为："+super.getXinghao()+"的"+super.getPinpai()+"手机；");
}
public void zhao() {
	// TODO Auto-generated method stub
	System.out.println("咔嚓。。。拍照成功");
}
public void wang() {
	// TODO Auto-generated method stub
	System.out.println("已启动移动网络");
}
	

}
