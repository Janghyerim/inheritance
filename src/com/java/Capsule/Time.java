package com.java.Capsule;

public class Time {  //ĸ��ȭ ����
	//��ü���� ���α׷� : oop(Object Oriented Programming) �� ���������� �˰� �ֱ�.
	//1. ��� : extends
	//2. ������ : �����ε�,�������̵�,����� Ȱ��
   /**3. ĸ��ȭ (�����ͺ�ȣ) : ����������(private)*/
	
	private int hour;
	private int minute;
	private int second;
//	final double PI;    //��� -> �����ڸ� ���� �ʱ�ȭ(�������� �빮�ڷ� �����ؾ� ��.)
//	
//	public Time(double pi) {
//		super();
//		PI = pi;
//	}
	
	/** getter / setter : �ܺο� ���������� �����Ű���� ������ ��ȸ�Ͽ� ���������� ���� �����ϵ��� ���ش�.*/
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0 || hour>23) {
			System.out.println("��ȿ���� ���� �� �Դϴ�.");
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0 || minute>59) {
			System.out.println("��ȿ���� ���� �� �Դϴ�.");
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0 || second>59) {
			System.out.println("��ȿ���� ���� �� �Դϴ�.");
		}
		this.second = second;
	}
	
	// getter / setter : �ܺο� ���������� �����Ű���� ������ ��ȸ�Ͽ� ���������� ���� �����ϵ��� ���ش�.
	
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
