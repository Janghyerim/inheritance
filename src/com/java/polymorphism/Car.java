package com.java.polymorphism;

public class Car {    //������ ���� ����� Ȱ��
	
	String color;
	int door;
	
	void driver() {
		System.out.println("driver gogo");
	}
	void stop() {
		System.out.println("stop");
	}
	
	//�Ű����� Car Ÿ������ ����
	//Car -> Car, FireEngine, Ambulance �ڱ��ڽ��� ������ �ڽ�Ÿ���� ���� �� �� ����.
	
	void doWork(Car c) { //�Ű������� Ȱ���� ��ü�� ������
		//instanceof
		//��ü�� Ÿ���� Ȯ���� �� �ִ� Ű����
		
		//c.water(); error
		//if(�������� instanceof Ŭ�����̸�(�˰���� Ÿ��))
		if(c instanceof FireEngine) {
			FireEngine fe = (FireEngine)c;  //��������ȯ �Ͼ.
			fe.water();
		}else if(c instanceof Ambulance){
			Ambulance ab = (Ambulance)c;
			ab.siren();
		}
	}

	
	
	
}
