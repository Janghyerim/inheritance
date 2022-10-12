package com.java.Tv;

public class TVCRTest {

	public static void main(String[] args) {
		
		TVCR tvcr = new TVCR();
		
		String print = tvcr.print.getLocation();
		String print1 = tvcr.print1.getLocation();
		
		System.out.println(print);
		System.out.println(print1);

	}
}
