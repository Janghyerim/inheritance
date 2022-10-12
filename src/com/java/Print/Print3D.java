package com.java.Print;

public class Print3D extends Print {
	public int z;
	
	//상속에서의 생성자의 특징
	//1. 부모생성자를 호출해야 한다.
	//2. 호출시에 super();를 사용한다.
	//3. 기본생성자인 경우 부모생성자의 기본생성자를 호출 한다.
	//4. 생성자는 상속되지 않는다.(멤버변수와 메소드만 상속되어진다.)
/**	
	Print3D(){
		super();  //Print(){} 생성자 호출
	}
*/	
	public Print3D(){
		super(10,20);  //Print(int x, int y)호출   ->  부모메소드의 생성 키워드를 따라 자식 메소드에도 똑같이 적용해야 에러가 없다.
		this.z = 30;
	}
	
	public Print3D (int x,int y,int z){
		super(x,y);    //Print(int x, int y)호출
		this.z = z;
	}
	
	//상속구조에 사용한다.
	//부모 메소드의 선언부과 자식 메소드의 선언부가 동일해야 한다.(리턴타입 포함)
	//매개변수가 같아야한다. ex)String getLocation
	//단,실행문은 재정의 한다.
	//부모의 메소드를 사용할때는 super라는 키워드를 사용한다.
	
	public String getLocation() { //오버라이딩(재정의) : 선언부는 동일하나, 구현부가 다르다.
		return super.getLocation() + " z : "+ z; //super는 자식메소드에서만 쓸 수있다.
	}

}
