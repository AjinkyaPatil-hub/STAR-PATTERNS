package com.array.larsmal;





public class SecondLargest {

	public void secondLargest(int arr[]){
		int largest=arr[0];
		int secondLargest=arr[0];
		//for passing array
		for(int i=0;i<arr.length;i++){
			//logic for largest number in array
			if(arr[i]>largest){
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest){
				secondLargest=arr[i];
			}
		}
		System.out.println("second largest element is:"+secondLargest);
	}

}
