package com.xworkz.xworkz2.constructor;

public class Movies {


	String movieName;
	String hero;
	String heroine;
	
	//public String name() {
		//return "KGF";
	//}
	
	//public int year() {
		//return 2022;
	//}
	
	Movies(){
		System.out.println("default const");
	}
	
	Movies(String movieName,String hero,String heroine){
		this.movieName=movieName;
		this.hero=hero;
		this.heroine=heroine;
				;
	}
}
