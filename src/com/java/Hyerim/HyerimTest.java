package com.java.Hyerim;

public class HyerimTest {

	public static void main(String[] args) {
		Hyerim hy = null;
		Fire fe = new Fire();
		Fire fe2 = null;
		Ambul am = new Ambul();
		Ambul am2 = null;
		
		
		fe.water();
		hy = fe;
		//hy.water();  //error
		hy.stop();
		hy.driver();
		fe2 = (Fire)hy; //강제 형변환
		fe2.water();
		
		am.siren();
		hy = am;
		am2 = (Ambul)hy;
		am2.siren();
		
		//doWork메소드 실행
	//	Hyerim hy = new Hyerim(); //Hyerim hy = null; 맨위에 줄을 주석 처리해야 안겹침
		hy.doWork(fe);
		hy.doWork(am);
		

	}

}
