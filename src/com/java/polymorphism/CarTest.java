package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {
		
		//�������� ������ ��ü����
		//�������� ����ȯ(������ �� �ִ� ����� ������ ���Ѵ�.)
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null; 
//		Ambulance ab = new Ambulance();
//		Ambulance ab2 = null;
//	
//		
//		fe.water();   
//		car = fe;  //Car = FireEngine(�Ϲݿ��� �ȵǳ� ��ӱ��������� ����.),�������� ����ȯ ,�θ𺯼��� �ڽĺ����� ġȯ
//		//car.water(); //error                                   
//		car.stop();
//		fe2 = (FireEngine)car;  //��������ȯ
//		fe2.water();
//		
//		ab.siren();
//		car = ab;
//		ab2 = (Ambulance)car;
//		ab2.siren();
		
		//doWork �޼ҵ� ����
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		
		Car car = new Car();
		car.doWork(fe);
		car.doWork(ab);
		
		
		           
	}

}
