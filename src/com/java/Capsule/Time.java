package com.java.Capsule;

public class Time {  //캡슐화 실행
	//객체지향 프로그램 : oop(Object Oriented Programming) 의 정의정도는 알고 있기.
	//1. 상속 : extends
	//2. 다형성 : 오버로딩,오버라이딩,상속을 활용
   /**3. 캡슐화 (데이터보호) : 접근제어자(private)*/
	
	private int hour;
	private int minute;
	private int second;
//	final double PI;    //상수 -> 생성자를 통한 초기화(변수값은 대문자로 지정해야 함.)
//	
//	public Time(double pi) {
//		super();
//		PI = pi;
//	}
	
	/** getter / setter : 외부에 직접적으로 노출시키지는 않지만 우회하여 간접적으로 접근 가능하도록 써준다.*/
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0 || hour>23) {
			System.out.println("유효하지 않은 값 입니다.");
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0 || minute>59) {
			System.out.println("유효하지 않은 값 입니다.");
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0 || second>59) {
			System.out.println("유효하지 않은 값 입니다.");
		}
		this.second = second;
	}
	
	// getter / setter : 외부에 직접적으로 노출시키지는 않지만 우회하여 간접적으로 접근 가능하도록 써준다.
	
//	public int getHour() {
//		return hour;
//	}
//	
//	public void setHour(int hour) {
//		this.hour = hour;
//	}
//	
//	public int getMinute() {
//		return minute;
//	}
//	
//	public void setMinute(int minute) {
//		this.minute = minute;
//	}
//	
//	public int getSecond() {
//		return second;
//	}
//	
//	public void setSecond(int second) {
//		this.second = second;
//	}


}
