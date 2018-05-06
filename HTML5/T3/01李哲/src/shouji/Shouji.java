package shouji;

public class Shouji {
	
private String brand;
private String type;

public Shouji(String brand, String type) {

	this.brand = brand;
	this.type = type;
}

public void sendInfo() {
	System.out.println("发送文字信息......");

}
 public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public void call() {
	 System.out.println("开始语音通话........ ");

}
public void Info() {
	System.out.println(toString());

}
public String toString() {
	return "手机型号为" + brand + "的" + type + "手机";
}
 
}
