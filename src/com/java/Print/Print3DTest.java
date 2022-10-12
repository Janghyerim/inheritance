package com.java.Print;
public class Print3DTest {

	public static void main(String[] args) {
//		Print3D p3 = new Print3D();  //Print3D() -> Print() -> object()
//		
//		p3.x = 10;
//		p3.y = 20;
//		p3.z = 30;
//		
//		
//		String point = p3.getLocation();
//		System.out.println(point);
// 값을 지정해놓고 출력 하는건 비효율 적으로 잘 사용 되지 않음.		
		
		Print3D p3 = new Print3D(100,200,30);
		
		String point = p3.getLocation();
		System.out.println(point);
//값을 변동성 있게 효율적으로 사용 하기 위해 이 방식으로 많이 사용 됨.		
		

	}

}
