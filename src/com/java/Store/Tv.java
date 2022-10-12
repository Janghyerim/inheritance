package com.java.Store;

public class Tv extends Product {
	
	Tv(){
		super(300000);
	}

	@Override  //오버라이딩
	public String toString() {
		return "Tv";
	}


}
