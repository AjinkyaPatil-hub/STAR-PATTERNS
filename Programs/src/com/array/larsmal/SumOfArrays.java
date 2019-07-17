package com.array.larsmal;

class SumArray{
	public int sumArray(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		return sum;
	}
}

public class SumOfArrays extends SumArray {

	public static void main(String[] args) {
		int arr[]={5,4,3,2,1};
		int leng=arr.length;
		System.out.println("there are "+leng+ " elements presnt in array" );
		SumOfArrays sum=new SumOfArrays();
		int totalSum=sum.sumArray(arr);
		System.out.println("Total sum of the array is:"+ totalSum);
		
	}

}
