package com.array.larsmal;

public class ArrayCopy {

	public static void main(String[] args) {
		int arr[]={4,3,2,1};
		int arrCopy[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			arrCopy[i]=arr[i];
		}
		for(int copy:arrCopy)
			System.out.print(" "+copy);
		
		
	}

}
