package basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P003_Exception {
	@Test(expected = Exception.class)
	public void test1() {
		System.out.println("test 1");
		int a = 10/0;
		assertEquals(1, a);
	}
}
