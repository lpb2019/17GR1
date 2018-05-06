package JiSuanJi;

public abstract class Cpu {
private String pingpai;
private String zhuping;

public Cpu(String pingpai, String zhuping) {
	super();
	this.pingpai = pingpai;
	this.zhuping = zhuping;
}
public String getPingpai() {
	return pingpai;
}
public void setPingpai(String pingpai) {
	this.pingpai = pingpai;
}
public String getZhuping() {
	return zhuping;
}
public void setZhuping(String zhuping) {
	this.zhuping = zhuping;
}
@Override
public String toString() {
	return "Cpu 的品牌是：" + pingpai + ", 主频为" + zhuping + "GHZ";
}
public abstract void print();
}
