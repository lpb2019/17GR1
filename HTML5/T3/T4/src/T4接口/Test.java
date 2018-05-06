package T4接口;

public class Test {
  public static void main(String[] args) {
	Men m=new Fshi();
	Suo s=new Fshi();
	Pai p=new Fshi();
	s.kaisuo();
	p.paizhao();
	m.kai();
	System.out.println("——————————");
	System.out.println("我要出去了");
	m.guan();
	s.shang();
}
}
