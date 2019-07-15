package com.array.programs;

public class AdditionOfArray {
	public static void main(String[] args) {
		
	int arr1[][]= {{8,9,6,8},{5,8,9}};
	int arr2[][]= {{8,9,6,8},{5,8,9}};
	int arr3[][]=new int[3][3] ;
	
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.println(arr3[i][j]);
			}
		}
		
	}

}
