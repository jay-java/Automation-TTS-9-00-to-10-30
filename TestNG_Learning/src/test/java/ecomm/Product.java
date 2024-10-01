package ecomm;

import org.testng.annotations.Test;

public class Product {
	@Test
	public void uploadProduct() {
		System.out.println("upload product");
	}

	@Test
	public void manageProduct() {
		System.out.println("manage product");
	}

	@Test
	public void deleteProduct() {
		System.out.println("remove product");
	}

	@Test(groups = "updateInCreditCard")
	public void searchProduct() {
		System.out.println("search product");
	}

	@Test
	public void addToWishList() {
		System.out.println("add to wishlist");
	}

	@Test(groups = "updateInCreditCard")
	public void addToCart() {
		System.out.println("add to cart");
	}
}
