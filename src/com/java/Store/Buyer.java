package com.java.Store;

public class Buyer {
	/**
	 * ������ ������ �Ǵ��� ����� ���̾� ������ �Ȱǵ帮�°� ���α׷� © ��, ���� ����Ʈ��.
	 */
	int money = 2000000;
	int bonusPoint = 0;
	                      //�ϳ��ϳ� �� ������ ȿ�������� �����Ƿ� �θ�Ÿ���� ���ָ� �ڽ�Ÿ���� �󸶵��� ������ ������ �� �� �ִ�.
	void buy(Product p) { //Tv, Computer, Audio, SmartPhone 
		if(money < p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString() + " ���� �Ϸ�");  //�ҽ��� �������̵� �̿��Ͽ� �� �Ű������� tostring �����ְ� ����ϸ� �ּҰ��� �ƴ� �� �Ű����� �̸��� ��µȴ�.
	}
}


//Product p = new Tv()  //2�� �������
//Tv t = new Tv()       //2�� ������� + �ڽ�Ÿ�� ����n��
//
//p.price //�θ𿡼� �޾ƿ� ���̴�.
//t.price

