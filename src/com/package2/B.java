package com.package2;

import com.package3.F;

//���������� ����
public class B extends F {  //public : ��� ��Ű�� ��ο� ��밡��
	
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
