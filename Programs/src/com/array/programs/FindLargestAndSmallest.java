package com.array.programs;

class AcceptArray{
	
	public static void FindLarSma(int []arr){
		
		
	}
}


public class FindLargestAndSmallest {

	public static void main(String[] args) {
		
		int arr[]={8,6,7,3};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				max=arr[i];
			}
		}
		System.out.println(max+" "+ min);
	}

}
