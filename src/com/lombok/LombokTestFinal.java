package com.lombok;

public class LombokTestFinal {

	public static void main(String[] args) {
		
		LombokTest lb = new LombokTest();
		lb.setName("������");
		System.out.println("�̸� : " + lb.getName());
		
		lb.setAge(25);
		lb.setAddr("���� ������");
		
		System.out.println("���� :"+lb.getAge()+'\t'+"�ּ� :"+lb.getAddr() );
	    
		

	}
	

}
