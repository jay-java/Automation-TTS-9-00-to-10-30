package basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class P007_Parametrized {
	
	int a,b,res;
	
	public P007_Parametrized(int a,int b,int res){
		this.a = a;
		this.b = b;
		this.res = res;
	}
	
	@Test
	public void addTest() {
		Calc c= new Calc();
		int actual = c.add(a, b);
		int expected = res;
		assertEquals(expected, actual);
	}
	
	@Parameters
	public static Object[] data() {
		Object obj[][] = new Object[4][3];
		obj[0][0] =12;
		obj[0][1] =13;
		obj[0][2] =120;
		
		obj[1][0] =10;
		obj[1][1] =20;
		obj[1][2] =30;
		
		obj[2][0] =12;
		obj[2][1] =1;
		obj[2][2] =13;
		
		obj[3][0] =1;
		obj[3][1] =1;
		obj[3][2] =12;
		
		return obj;
		
	}
}
