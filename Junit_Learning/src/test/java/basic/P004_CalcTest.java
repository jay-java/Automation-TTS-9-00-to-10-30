package basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P004_CalcTest {
	@Test
	public void addTest() {
		Calc c = new Calc();
		int actualRes = c.add(12, 23);
		int expectedRes = 35;
		assertEquals(expectedRes, actualRes);
	}
}
