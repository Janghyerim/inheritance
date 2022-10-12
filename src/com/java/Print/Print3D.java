package com.java.Print;

public class Print3D extends Print {
	public int z;
	
	//��ӿ����� �������� Ư¡
	//1. �θ�����ڸ� ȣ���ؾ� �Ѵ�.
	//2. ȣ��ÿ� super();�� ����Ѵ�.
	//3. �⺻�������� ��� �θ�������� �⺻�����ڸ� ȣ�� �Ѵ�.
	//4. �����ڴ� ��ӵ��� �ʴ´�.(��������� �޼ҵ常 ��ӵǾ�����.)
/**	
	Print3D(){
		super();  //Print(){} ������ ȣ��
	}
*/	
	public Print3D(){
		super(10,20);  //Print(int x, int y)ȣ��   ->  �θ�޼ҵ��� ���� Ű���带 ���� �ڽ� �޼ҵ忡�� �Ȱ��� �����ؾ� ������ ����.
		this.z = 30;
	}
	
	public Print3D (int x,int y,int z){
		super(x,y);    //Print(int x, int y)ȣ��
		this.z = z;
	}
	
	//��ӱ����� ����Ѵ�.
	//�θ� �޼ҵ��� ����ΰ� �ڽ� �޼ҵ��� ����ΰ� �����ؾ� �Ѵ�.(����Ÿ�� ����)
	//�Ű������� ���ƾ��Ѵ�. ex)String getLocation
	//��,���๮�� ������ �Ѵ�.
	//�θ��� �޼ҵ带 ����Ҷ��� super��� Ű���带 ����Ѵ�.
	
	public String getLocation() { //�������̵�(������) : ����δ� �����ϳ�, �����ΰ� �ٸ���.
		return super.getLocation() + " z : "+ z; //super�� �ڽĸ޼ҵ忡���� �� ���ִ�.
	}

}
