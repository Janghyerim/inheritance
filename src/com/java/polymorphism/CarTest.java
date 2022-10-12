package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {
		
		//다형성을 적용한 객체생성
		//참조형의 형변환(참조할 수 있는 멤버의 갯수가 변한다.)
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null; 
//		Ambulance ab = new Ambulance();
//		Ambulance ab2 = null;
//	
//		
//		fe.water();   
//		car = fe;  //Car = FireEngine(일반에선 안되나 상속구조에서는 가능.),참조형의 형변환 ,부모변수에 자식변수를 치환
//		//car.water(); //error                                   
//		car.stop();
//		fe2 = (FireEngine)car;  //강제형변환
//		fe2.water();
//		
//		ab.siren();
//		car = ab;
//		ab2 = (Ambulance)car;
//		ab2.siren();
		
		//doWork 메소드 실행
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		
		Car car = new Car();
		car.doWork(fe);
		car.doWork(ab);
		
		
		           
	}

}
