package com.xworkz.xworkz2.Oops;

public class CarRunnerMultilevel {

	public static void main(String args[]) {
		
		//Car car=new Car();
		RenaultTriber triber=new RenaultTriber();
		Maruthi800 maruthi=new Maruthi800();
		triber.color();
		triber.company();
		triber.mileageCar();
		triber.service();
		maruthi.color();
		maruthi.mileage();
		maruthi.mileageCar();
	}
}
