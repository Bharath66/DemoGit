package org.test.git;

public class Axis implements HDFC{

	@Override
	public void deposit() {
		System.out.println("deposit amount is 5000");
		
	}

	@Override
	public void dInterest() {
		System.out.println("deposit interest is 8%");
		
	}
	public static void main(String[] args) {
		Axis a = new Axis();
		a.deposit();
		a.dInterest();
	}

}
