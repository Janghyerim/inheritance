package com.package3;

public class E {  //private : 클래스 내에서만 사용가능 예시
	private int e;

	private E(int e) {
		super();
		this.e = e;
	}
	
	private void printE() {
		System.out.println(e);
	}

}
