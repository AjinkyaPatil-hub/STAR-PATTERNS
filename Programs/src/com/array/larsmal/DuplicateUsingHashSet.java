package com.array.larsmal;

import java.util.HashSet;

public class DuplicateUsingHashSet {
	
	public void duplicateHashSet(int arr[]){
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		System.out.println("\nduplicate removed using hash set");
		for(int num:hs)
			System.out.print(" "+num);
	}
}
