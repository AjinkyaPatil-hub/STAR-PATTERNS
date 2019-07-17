package com.array.larsmal;

public class FindMissingInArray {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,8};
		int count = 1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==count){
				count++;
			}else{
				System.out.println("missing number"+count);
			}
		}
		
	}

}
