package com.java.Hyerim;

public class Hyerim {//Car
	
	String color;
	int door;
	
	void driver() {
		System.out.println("driver gogo");
	}
	
	void stop() {
		System.out.println("stop!!!!!!!!");
	}

	void doWork(Hyerim h) {
		if(h instanceof Fire) {
			Fire fe = (Fire)h;
			fe.water();
		}else if(h instanceof Ambul) {
			Ambul am = (Ambul)h;
			am.siren();
		}
	}
}
