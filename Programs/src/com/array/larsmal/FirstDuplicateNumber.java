package com.array.larsmal;

public class FirstDuplicateNumber {
	
	public void firstDuplicate(int arr[]){
		//
		int temp = 0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("First duplicate number "+ arr[i]);
					temp=temp+1;
					break;
				}
			}
			//to come from main for loop
			if(temp>0)
				break;
		}

	}

}