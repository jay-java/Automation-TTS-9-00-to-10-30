package dependency;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class User {
	@Test
	public void createAccount() {
		System.out.println("create account");
	}
	@Test(dependsOnMethods = "createAccount")
	public void login() {
		System.out.println("login");
		assertFalse(true);
	}
	@Test(dependsOnMethods = "login")
	public void changePassword() {
		System.out.println("change password");
	}
	@Test(dependsOnMethods = "login")
	public void profile() {
		System.out.println("profile");
	}
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("logout");
	}
}
