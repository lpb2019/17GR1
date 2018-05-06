package mt;

public class Test {
public static void gai(sj s){
	if(s instanceof Putong){
		Putong k =(Putong)s;
		k.dian();
		k.bl("初雪");
		k.dian();
		k.dianhua();
	}else if(s instanceof Zhineng){
		Zhineng z = (Zhineng)s;
		z.bl("小时代");
		z.zhao();
		z.dian();
		z.dianhua();
		
	}

}
public static void main(String[] args) {
	sj p=new Putong("诺65","诺基亚");
    p.print();
    gai(p);
    System.out.println();
    System.out.println("......");
    System.out.println();
    System.out.println();
    sj z=new Zhineng("vivo x20Plus","步步高");
    z.print();
    gai(z);
}
}


