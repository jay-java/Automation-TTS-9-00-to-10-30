package core;

public class P003_TypeCasting {
	public static void main(String[] args) {
		int i = 1;//4
		System.out.println(i);
		double d = i;//8
		System.out.println(d);
		double d1 = 3.14;
		int j = (int)d1;
		System.out.println(j);
		
		int a = 10;
		int b = 3;
		double c = (double)a/(double)b;
		System.out.println("c = "+c);
	}
}
