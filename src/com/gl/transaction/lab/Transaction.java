package com.gl.transaction.lab;

public class Transaction {
	public int transactionCheck(int[] arr,int target) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>=target) {
				return i+1;	
			}
				
		}
		return -1;
		
	}

	

	
}
