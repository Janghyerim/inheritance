package com.java.polymorphism;

public class Car {    //다형성 안의 상속을 활용
	
	String color;
	int door;
	
	void driver() {
		System.out.println("driver gogo");
	}
	void stop() {
		System.out.println("stop");
	}
	
	//매개변수 Car 타입으로 정의
	//Car -> Car, FireEngine, Ambulance 자기자신을 포함한 자식타입을 정의 할 수 있음.
	
	void doWork(Car c) { //매개변수를 활용한 객체의 다형성
		//instanceof
		//객체의 타입을 확인할 수 있는 키워드
		
		//c.water(); error
		//if(참조변수 instanceof 클래스이름(알고싶은 타입))
		if(c instanceof FireEngine) {
			FireEngine fe = (FireEngine)c;  //강제형변환 일어남.
			fe.water();
		}else if(c instanceof Ambulance){
			Ambulance ab = (Ambulance)c;
			ab.siren();
		}
	}

	
	
	
}
