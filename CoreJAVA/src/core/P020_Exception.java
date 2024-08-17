package core;

import java.util.InputMismatchException;
import java.util.Scanner;

//checked
//unchecked
class Divide { // A-dev
	public void division() throws ArithmeticException,InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if(b<0) {
			throw new ArithmeticException("aaaaaa");
		}
		else if(b!=0) {
			throw new InputMismatchException("aaaa"); 
		}
		else {
			int c = a / b;
			System.out.println(c);
		}
	}
}

public class P020_Exception { // B-tester
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("jjj");
		}catch(InputMismatchException e) {
			System.out.println("sss");
		}

//		System.out.println("hello");
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a / b;
//			System.out.println(c);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator should be graater than 0");
//		} catch (InputMismatchException e) {
//			System.out.println("denominator should be numeric values");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will  exectue everytime");
//		}
	}
}
