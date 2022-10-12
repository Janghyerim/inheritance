package com.java.Tv;

//자동 임포트 단축키 ctrl+shift+o
//import com.java.Print.Print;  
//import com.java.Print.Print3D;
import com.java.Print.*; //프린트 패키지안에 있는 모든걸 다 참조하여 쓰겠다.

public class Tv {
	                                   //프린트객체를 생성하고 불러올 때 기존 프린터생성자 앞에  Public이 붙어야 함.
	Print print = new Print(10,20);  //인스턴스 멤버변수,포함관계 (상속x)
	Print3D print1 = new Print3D(10,20,30);
	
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
