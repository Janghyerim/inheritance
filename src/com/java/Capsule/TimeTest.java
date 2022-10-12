package com.java.Capsule;

public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time();
//		t.hour = 23;    // 1 ~ 23
//		t.minute = 48;
//		t.second = 59;
		
		t.setHour(23);  //set이 값을 불러오는 것이기 때문에 get말고 set을 쓴다.
		t.setMinute(48);
		t.setSecond(59);
		System.out.println(t.getHour()+"시 "+ t.getMinute()+"분 "+t.getSecond()+"초");

	}

}
