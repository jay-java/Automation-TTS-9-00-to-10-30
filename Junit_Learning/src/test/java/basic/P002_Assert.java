package basic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class P002_Assert {
	@Test
	public void test1() {
		System.out.println("test 1");
		int a = 10;
		int b = 10;
		int c = a+b;
//		assertEquals(21, c);
//		assertTrue(false);
		int a1[] = {1,2,3,4};
		int a2[] = {1,2,3,4,5};
		assertArrayEquals(a1, a2);
	}
}
