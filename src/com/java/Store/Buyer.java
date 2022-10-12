package com.java.Store;

public class Buyer {
	/**
	 * 공급자 변경이 되더라도 사려는 바이어 정보를 안건드리는게 프로그램 짤 때, 가장 베스트임.
	 */
	int money = 2000000;
	int bonusPoint = 0;
	                      //하나하나 다 쓸려면 효율적이지 않으므로 부모타입을 써주면 자식타입은 얼마든지 변수의 값으로 올 수 있다.
	void buy(Product p) { //Tv, Computer, Audio, SmartPhone 
		if(money < p.price) {
			System.out.println("금액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString() + " 구매 완료");  //소스에 오버라이드 이용하여 각 매개변수에 tostring 입혀주고 출력하면 주소값이 아닌 각 매개변수 이름이 출력된다.
	}
}


//Product p = new Tv()  //2개 멤버변수
//Tv t = new Tv()       //2개 멤버변수 + 자식타입 변수n개
//
//p.price //부모에서 받아온 값이다.
//t.price

