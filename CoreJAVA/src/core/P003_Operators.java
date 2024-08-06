package core;

//1.assignment => =,+=,-=,*=,/=
//2.arithmetic => +,-,*,/,%
//3.logical => &&(and),||(or),!(not)
//4.conditional => >,<,>=,<=,!=
//5.unary => ++,--
public class P003_Operators {
	public static void main(String[] args) {
		// 1.arithmetic
		int i = 10, j = 3, k;
		k = i + j;
		System.out.println("addition of " + i + " and " + j + " = " + k);
		System.out.println("addition of i and j = " + (i + j));
		k = i - j;
		System.out.println(k);
		k = i * j;
		System.out.println(k);
		k = i / j;
		System.out.println(k);
		k = i % j;
		System.out.println(k);

		// 2.conditional
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i != j);

		// 3.assignment
		int a = 12, b = 13;
		a += b; // a = a+b
		System.out.println(a);// 25
		a -= 12; // a = a-12
		System.out.println(a);
		a *= 3; // a = a*3
		System.out.println(a);
		a /= 3;// a = a/3
		System.out.println(a);

		// 4.unary
		int q = 13;
		q++; // q = q+1
		System.out.println(q);//14
		q--;
		System.out.println(q);//13
		int z = q++;
		System.out.println(z);
		System.out.println(q);
	}
	

}
