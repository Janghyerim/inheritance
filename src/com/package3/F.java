package com.package3;

public class F {  //protected : 같은 패키지 or 상속 받은 관계에 있는 다른 패키지 경로에 사용가능 예시
	protected int f;

	protected F(int f) {
		super();
		this.f = f;
	}
	
	protected void printF() {
		System.out.println(f);
	}

}
