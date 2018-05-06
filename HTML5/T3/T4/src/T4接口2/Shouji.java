package T4½Ó¿Ú2;

public  abstract class Shouji {
private String xinghao ;
private String pinpai;
public Shouji(String xinghao, String pinpai) {
	super();
	this.xinghao = xinghao;
	this.pinpai = pinpai;
}
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
public Shouji() {
	super();
	// TODO Auto-generated constructor stub
}

public abstract void print();
public abstract void duan();
public abstract void dianhua();



}
