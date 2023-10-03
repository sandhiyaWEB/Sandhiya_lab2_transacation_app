package com.gl.transaction.lab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Transaction t = new Transaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array ");
		int noOfTransactions = sc.nextInt();
		
		System.out.println("enter the values of array ");
		int arr[] = new int[noOfTransactions];
		for(int i=0;i<noOfTransactions;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be achieved ");
		int noOfTargets = sc.nextInt();
		
		for(int i=0;i<noOfTargets;i++) {
			System.out.println("enter the value of target ");
			int target = sc.nextInt();
			int result = t.transactionCheck(arr,target);
			if(result>0) {
			System.out.println("Target achieved after " +result+  " transactions");
			}
			else {
				System.out.println("Given target is not achieved");
			}
		
		}
		sc.close();
		

	}

}
