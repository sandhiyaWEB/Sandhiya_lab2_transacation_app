package com.gl.Currency.lab;

public class Currency {
	public void currencyCount(int[] arr,int payValue) {
		int[] count = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(payValue >= arr[i]) {
				int notes = payValue/arr[i];
				payValue = payValue-(arr[i]*notes);
				count[i] = notes;
				if(payValue==0) {
					break;
				}
			}
		}
		if(payValue==0) {
			System.out.println("Your Payment approach in order to give min no of notes will be");
			for(int i=0;i<arr.length;i++) {
				if(count[i]!=0) {
					System.out.println(arr[i]+" : "+count[i]);
				}
			}
		}
		else {
			System.out.println("lesser denominations not available");
		}
	}

}
