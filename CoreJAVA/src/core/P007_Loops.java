package core;

import java.util.Scanner;

//1.for(initialization;condition;incre/decre){body}
//2.while(condition){body}
//3.do{body} while(condition);
//4.for each
public class P007_Loops {
	public static void main(String[] args) {
		System.out.println("for loop");
		for (int i = 11; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("while loop");
		int j = 11;
		while (j <= 10) {
			System.out.println(j);
			j++;
		}
		System.out.println("do while loop");
		int k=11;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=10);
		
//		for (int i = 10; i >= 1; i--) {
//			System.out.println(i);
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num : ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}