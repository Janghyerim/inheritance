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
		fe2 = (Fire)hy; //���� ����ȯ
		fe2.water();
		
		am.siren();
		hy = am;
		am2 = (Ambul)hy;
		am2.siren();
		
		//doWork�޼ҵ� ����
	//	Hyerim hy = new Hyerim(); //Hyerim hy = null; ������ ���� �ּ� ó���ؾ� �Ȱ�ħ
		hy.doWork(fe);
		hy.doWork(am);
		

	}

}
