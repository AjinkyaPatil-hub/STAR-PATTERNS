package com.array.larsmal;

public class LargestAndSmallest {
	
	public void larSmall(int arr[]){
		int largest=arr[0];
		int smallest=arr[0];
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
			else if(arr[i]<smallest){
				smallest=arr[i];
			}
		}
		System.out.println("arrary largest element:"+largest+"\n"+"smallest elemnt in array:"+smallest);
	}
}
