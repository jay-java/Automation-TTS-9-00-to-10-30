package listener;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class User {
	@Test
	public void createAccount() {
		System.out.println("create account");
	}
	@Test
	public void login() {
		System.out.println("login user");
		assertFalse(true);
	}
	@Test(dependsOnMethods = "login")
	public void profile() {
		System.out.println("profile");
	}
}
