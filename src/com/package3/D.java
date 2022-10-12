package com.package3;

public class D {
	C c = new C(10);
	//E e = new E(20);  //error : 생성자가 private하기 때문에
	F f = new F(30);
	
	
	void printD() {
		System.out.println(c.c);
//		f.printF();
//		f.f = 30;
		System.out.println(f.f);
	}

}
