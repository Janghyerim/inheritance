package com.package5;

import com.package4.Time;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = 10; private 오류 조건
		//t.min = 10; protected
		//t.nanosec = 10; default
		t.sec = 10;  //public
		
		System.out.println(t.sec);

	}

}
