package com.xworkz.xworkz2.methodOverloading;

public class Theater {

	public void movie(String name,int timings) {
		System.out.println(name+" "+timings);
	}
	
	public void movie(String name) {
		System.out.println(name);
	}
	
}
