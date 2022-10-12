package com.javacho.book;

import com.package1.A;
import com.package2.B;
import com.package3.C;
import com.package3.E;
import com.package3.F;

public class AccessModifiy {

	public static void main(String[] args) {
		//접근제어자
		//private < default < protected < public
		//public : 모든 패키지 경로에 사용가능
		//protected : 같은 패키지 or 상속 받은 관계에 있는 다른 패키지 경로에 사용가능
		//default : 같은 패키지에서만 사용가능
		//private : 클래스 내에서만 사용가능
		
		//클래스 : public, default
		//변수 : public, protected, default, private
		//생성자 : public, protected, default, private
		//메소드 : public, protected, default, private
		//단, 지역변수는 사용불가
		
		//public한 경우에만 패키지와 상관없이 생성과 상속이 가능하다.
		//단,protected는 상속에 의해 다른패키지에서 사용 가능하다.
		
		A a = new A(50);
		B b = new B(10);
		//C c = new C(20); error : 생성자가 default이기 때문에 
		//E e = new E(30); error : 생성자가 private하기 때문에
		//F f = new F(50); error : 생성자가 protected하기 때문에
		
		
	}
	
	
	

}
