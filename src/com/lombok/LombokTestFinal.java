package com.lombok;

public class LombokTestFinal {

	public static void main(String[] args) {
		
		LombokTest lb = new LombokTest();
		lb.setName("장혜림");
		System.out.println("이름 : " + lb.getName());
		
		lb.setAge(25);
		lb.setAddr("서울 영등포");
		
		System.out.println("나이 :"+lb.getAge()+'\t'+"주소 :"+lb.getAddr() );
	    
		

	}
	

}
