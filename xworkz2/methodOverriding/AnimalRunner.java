package com.xworkz.xworkz2.methodOverriding;

public class AnimalRunner {

	public static void main(String args[]) {
		Animal animal=new Animal();
		Tiger tiger=new Tiger();
		animal.tiger(2, "female");
		tiger.tiger(5, "male");
	}
}
