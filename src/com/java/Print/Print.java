package com.java.Print;

public class Print {
	public int x;
	public int y;
	
//	Print(){
//		super();  //object Ŭ������ ������ ȣ��
//	}  �⺻������ ȣ���� �����Ǿ��ִ� ����.
	
	 public Print(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "x : "+ x + " y : "+ y;
	}
}


