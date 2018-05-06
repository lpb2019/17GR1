package mt;

public abstract class sj {
private String xinghao;
private String pinpai;
public String getXinghao() {
	return xinghao;
}
public void setXinghao(String xinghao) {
	this.xinghao = xinghao;
}
public String getPinpai() {
	return pinpai;
}
public void setPinpai(String pinpai) {
	this.pinpai = pinpai;
}
public sj(String xinxi, String dianhua) {
	super ();
}
   public sj() {
	// TODO Auto-generated constructor stub
}
public abstract void print();
   public abstract void dian();
   public abstract void dianhua();

}
