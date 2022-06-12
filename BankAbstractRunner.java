package com.xworkz.xworkz2.Oops.Abstraction;

public class BankAbstractRunner {
	    
		public static void main(String args[]){    
		Bank b;  
		b=new SBI();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		b=new KaveriBank();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		}    
}
