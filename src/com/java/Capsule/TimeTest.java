package com.java.Capsule;

public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time();
//		t.hour = 23;    // 1 ~ 23
//		t.minute = 48;
//		t.second = 59;
		
		t.setHour(23);  //set�� ���� �ҷ����� ���̱� ������ get���� set�� ����.
		t.setMinute(48);
		t.setSecond(59);
		System.out.println(t.getHour()+"�� "+ t.getMinute()+"�� "+t.getSecond()+"��");

	}

}
