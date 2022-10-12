package com.package5;

import com.package4.Time;

public class TimeChild extends Time {
	
	void printAll() {
		//System.out.println(hour);
		System.out.println(min);  //protected 
		//System.out.println(nanosec);
		System.out.println(sec);  //public
	}

}
