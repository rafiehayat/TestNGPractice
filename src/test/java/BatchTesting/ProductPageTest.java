package BatchTesting;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class ProductPageTest {
	
	@Test
	public void AddProductToWishlist() {
		System.out.println("AddProductToWishlist Passed");
	}
	@Test
	public void AddProductToCart() {
		System.out.println("AddProductToCart Passed");
	}
	@Test
	public void SelectQuantity() {
		System.out.println("SelectQuantity Passed");
	}

}
