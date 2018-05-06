package t04.print;

import java.util.Scanner;

public class Print {
	inkbox id;
	Paper p;
	public void setId(inkbox id) {
		this.id = id;
	}
	public void setP(Paper p) {
		this.p = p;
	}
	public void printer(){
		System.out.println("墨盒："+id.color()+"纸张："+p.papersizi());
	}
	public static void main(String[] args) {
		
		Print p=new Print();
		String s="s";
		while(!s.equals(null)){
		System.out.println("请选择你要使用的墨盒   1、彩色 2、黑白");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		if(i==1){
			p.setId(new colormohe());
		}else if(i==2){
			p.setId(new blackmohe());
		}
		System.out.println("请选择你要用的纸张 1、A4 2、B5");
		int j = sc.nextInt();
		if(j==1){
			p.setP(new A4Pape());
		}else if(j==2){
			p.setP(new B5Paper());
		}
		p.printer();
		System.out.println("请输入任意键继续打印");
		s=sc.next();
		}
	}

}

