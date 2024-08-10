package core;

import java.util.Scanner;

public class P010_Array {
	public static void main(String[] args) {
		int i[] = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(i[0]);
//		System.out.println(i[1]);
//		System.out.println(i[2]);
		for(int index=0;index<i.length;index++) {
			System.out.println(i[index]);
		}

		int sum=0;
		for(int index=0;index<i.length;index++) {
			sum = sum+i[index];
		}
		System.out.println("sum of array ele : "+sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int index=0;index<a.length;index++) {
			System.out.print("enter number at a["+index+"] : ");
			a[index] = sc.nextInt();
		}
		System.out.println("enter number to search in array : ");
		int num = sc.nextInt();
		int counter=0;
		for(int index=0;index<a.length;index++) {
			if(num == a[index]) {
				counter++;
			}
		}
		if(counter>0) {
			System.out.println("yes exist "+counter+" times");
		}
		else {
			System.out.println("not exist");
		}
		
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr.length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
