package com.array.larsmal;

public class PrintArrayInReverse {
	public static void main(String[] args) {
		int arr[]={9,2,7,6};
		PrintArrayInReverse.reverse(arr);
			}
	
	public static void reverse(int arr[]){
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(" "+arr[i]);
		}
	}
	
	
}
