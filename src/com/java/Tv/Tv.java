package com.java.Tv;

//�ڵ� ����Ʈ ����Ű ctrl+shift+o
//import com.java.Print.Print;  
//import com.java.Print.Print3D;
import com.java.Print.*; //����Ʈ ��Ű���ȿ� �ִ� ���� �� �����Ͽ� ���ڴ�.

public class Tv {
	                                   //����Ʈ��ü�� �����ϰ� �ҷ��� �� ���� �����ͻ����� �տ�  Public�� �پ�� ��.
	Print print = new Print(10,20);  //�ν��Ͻ� �������,���԰��� (���x)
	Print3D print1 = new Print3D(10,20,30);
	
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
