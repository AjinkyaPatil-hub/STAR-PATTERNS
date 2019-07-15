package com.array.larsmal;

public class SecondSmallest extends SecondLargest {
		
	public void seconSmallest(int arr[]){
		int secondSmallest=arr[0];
		
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++){
			//logic for smallest number is
			if(arr[i]<smallest){
				secondSmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondSmallest){
				secondSmallest=arr[i];
			}
		}
		System.out.println("second smallest element is:"+ secondSmallest);
	}
}
