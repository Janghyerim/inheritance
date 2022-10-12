package com.package2;

import com.package3.F;

//접근제어자 예시
public class B extends F {  //public : 모든 패키지 경로에 사용가능
	
	public int b;

	public B(int b) {
		super(10);  //f
		this.b = b;
	}
	
	public void printB() {
		System.out.println(b);
		System.out.println(f);
		printF();
	}

}
