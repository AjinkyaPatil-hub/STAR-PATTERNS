package com.array.larsmal;

import java.util.HashSet;

/**
 * eplanation
 * first traverse your array in reverse manner
 * then check the element of array ,that it CONTAINS in hashset 
 * if yes then set the value of temp to its index position i.e i(we got the duplicate elemnt) 
 * else add the element in the hashset
 */
	
public class FirstDuplicateUsingHashSet {
	public static void main(String[] args) {
		int arr[]={8,2,7,9,2,6};
		FirstDuplicateUsingHashSet first=new FirstDuplicateUsingHashSet();
		first.duplicateUsingHashSet(arr);
	}
	int temp=-1;
	public  void duplicateUsingHashSet(int arr[]){
	
	HashSet<Integer> hs=new HashSet<>();
		for(int i=arr.length-1;i>=0;i--){
			if(hs.contains(arr[i])){
				temp=i;
			}else{
				hs.add(arr[i]);
			}
		}
		if(temp>0){
			System.out.println("first duplicate number in array is:"+ arr[temp]);
		}
	}
}