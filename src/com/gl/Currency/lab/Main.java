package com.gl.Currency.lab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("enter the currency denominations value ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		

		
		
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		
		MergeSort sort = new MergeSort();
		sort.sort(arr, 0, arr.length-1);
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		Currency curr = new Currency();
		curr.currencyCount(arr,amount);
		
		sc.close();
	}

}
