package com.t01;

public class TheftproofDoor extends Door implements Lock ,DoorBell {
	



public void open() {
	System.out.println("开门");
	
}


public void close() {
	System.out.println("关门");
	
}

public void bell(){
	System.out.println("铃······咔嚓·····照片已储存");
}

public void lockUp() {
	System.out.println("上锁,向右旋转三圈");
	
}



public void openLock() {
	System.out.println("开锁,向左旋转三圈");
	
}
}