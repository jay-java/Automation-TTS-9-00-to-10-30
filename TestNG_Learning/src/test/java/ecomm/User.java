package ecomm;

import org.testng.annotations.Test;

public class User {
	@Test
	public void createAccount() {
		System.out.println("create account");
	}
	@Test(groups = {"updateInCreditCard","updateInUPI"})
	public void login() {
		System.out.println("login");
	}
	@Test
	public void changePassword() {
		System.out.println("change password");
	}
	@Test
	public void profile() {
		System.out.println("profile");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
}
