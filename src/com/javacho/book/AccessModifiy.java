package com.javacho.book;

import com.package1.A;
import com.package2.B;
import com.package3.C;
import com.package3.E;
import com.package3.F;

public class AccessModifiy {

	public static void main(String[] args) {
		//����������
		//private < default < protected < public
		//public : ��� ��Ű�� ��ο� ��밡��
		//protected : ���� ��Ű�� or ��� ���� ���迡 �ִ� �ٸ� ��Ű�� ��ο� ��밡��
		//default : ���� ��Ű�������� ��밡��
		//private : Ŭ���� �������� ��밡��
		
		//Ŭ���� : public, default
		//���� : public, protected, default, private
		//������ : public, protected, default, private
		//�޼ҵ� : public, protected, default, private
		//��, ���������� ���Ұ�
		
		//public�� ��쿡�� ��Ű���� ������� ������ ����� �����ϴ�.
		//��,protected�� ��ӿ� ���� �ٸ���Ű������ ��� �����ϴ�.
		
		A a = new A(50);
		B b = new B(10);
		//C c = new C(20); error : �����ڰ� default�̱� ������ 
		//E e = new E(30); error : �����ڰ� private�ϱ� ������
		//F f = new F(50); error : �����ڰ� protected�ϱ� ������
		
		
	}
	
	
	

}
