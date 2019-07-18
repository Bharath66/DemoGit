package org.test.git;

import org.test.demo.SBI;

public class Axis implements SBI,HDFC{

	@Override
	public void deposit() {
		System.out.println("deposit amount is 5000");
		
	}

	@Override
	public void dInterest() {
		System.out.println("deposit interest is 8%");
		
	}

	@Override
	public void fixedAmount() {
		System.out.println("The fixed amount is 10000");
		
	}

	@Override
	public void fixedInterest() {
		System.out.println("The fixed interest is 10%");
		
	}
	public static void main(String[] args) {
		Axis a = new Axis();
		a.deposit();
		a.dInterest();
		a.fixedAmount();
		a.fixedInterest();
	}

}
