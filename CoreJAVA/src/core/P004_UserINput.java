package core;

import java.util.Scanner;

class Q{
	public void run() {
		System.out.println("run in Q class");
	}
	public void call() {
		System.out.println("call fun in Q class");
	}
}
public class P004_UserINput {
	public static void main(String[] args) {
		int i;
		Q obj = new Q();
		obj.run();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		i = sc.nextInt();
		System.out.println(i);
		System.out.println("enter double value : ");
		double d = sc.nextDouble();
		
	}
}
