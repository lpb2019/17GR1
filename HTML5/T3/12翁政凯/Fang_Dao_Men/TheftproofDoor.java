package com.qhit.t04.Fang_Dao_Men;

public class TheftproofDoor implements Lock,DoorBell,Door{

	public void Pai_Zhao() {
		System.out.println("拍照");
	}

	public void Shang_Suo() {
		System.out.println("上锁！");
		
	}

	public void Kai_Suo() {
		System.out.println("开锁！");
		
	}

	public void Kai() {
		System.out.println("开门");
	}

	public void Guan() {
		System.out.println("关门");
	}
	
public static void main(String[] args) {
	TheftproofDoor t = new TheftproofDoor();
	t.Guan();
	t.Shang_Suo();
	t.Pai_Zhao();
	t.Kai_Suo();
	t.Kai();
	}
}
