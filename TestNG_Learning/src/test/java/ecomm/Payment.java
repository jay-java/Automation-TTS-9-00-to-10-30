package ecomm;

import org.testng.annotations.Test;

public class Payment {
	@Test(groups = "updateInCreditCard")
	public void creaditCard() {
		System.out.println("credit card");
	}

	@Test
	public void debittCard() {
		System.out.println("debit card");
	}

	@Test
	public void COD() {
		System.out.println("COD");
	}

	@Test(groups = "updateInUPI")
	public void UPI() {
		System.out.println("UPI");
	}
}
