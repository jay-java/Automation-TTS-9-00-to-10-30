package core;

import java.util.Scanner;

//(paranthases)
public class P006_ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		int i = sc.nextInt();
		System.out.println("enter j = ");
		int j = sc.nextInt();
		// 1.simple if
		if (i > j) {
			System.out.println("i is greater than j");
		}

		// if else
		if (i > j) {
			System.out.println("i is greater than j");
		} else {
			System.out.println("j is greater than i");
		}

		// nested if
		System.out.println("enter age : ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is gerater than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// else if ladder
		System.out.println("enter marks : ");
		int m = sc.nextInt();
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 60) {
			System.out.println("D grade");
		} else if (m >= 61 && m <= 70) {
			System.out.println("C grade");
		}

		else if (m >= 71 && m <= 80) {
			System.out.println("B grade");
		}

		else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		}

		else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalind input");
		}

		// switch
		System.out.println("1.english\n2.hindi\n3.gujarati");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected guj");
			break;
		default:
			System.out.println("invalid input");
		}

	}
}
