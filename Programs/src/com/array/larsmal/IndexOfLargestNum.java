package com.array.larsmal;

public class IndexOfLargestNum {

	public void indexOfLargeNum(int arr[]){
		int largest=arr[0];
		int index=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
				index=i;
			}
		}
		System.out.println("index of largest value in the array:"+ index);
	}
	

	public void indexOfSmallestNum(int arr[]){
		int smallest=arr[0];
		int index=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smallest){
				smallest=arr[i];
				index=i;
			}
		}
		System.out.println("index of smallest value in the array:"+ index);
	}
}
