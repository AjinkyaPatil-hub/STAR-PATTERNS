package com.array.larsmal;

public class AppearsOnceInArrayByXOR {

	public static void main(String[] args) {
	
	int arr[]={9,8,7,6,5,6,9,8,7};
	int result=arr[0];
	for(int i=1;i<arr.length;i++){
		result=result^arr[i];
	}
	System.out.println("the element which is only one apper is:"+result);
	
	
	}
}
