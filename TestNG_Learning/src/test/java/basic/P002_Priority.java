package basic;

import org.testng.annotations.Test;

public class P002_Priority {
	@Test(priority = 1,expectedExceptions = ArithmeticException.class)
	public void createAccount() {
		int a = 10/0;
		System.out.println("create account");
	}
	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}
	@Test(priority = 3)
	public void changePassword() {
		System.out.println("change password");
	}
	@Test(priority = 4)
	public void profile() {
		System.out.println("profile");
	}
	@Test(priority = 5)
	public void logout() {
		System.out.println("logout");
	}
}
