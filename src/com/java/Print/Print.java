package com.java.Print;

public class Print {
	public int x;
	public int y;
	
//	Print(){
//		super();  //object 클래스의 생성자 호출
//	}  기본생성자 호출이 생략되어있는 것임.
	
	 public Print(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "x : "+ x + " y : "+ y;
	}
}


