package com.array.larsmal;

import java.util.HashSet;

public class MainCommonElem {

	public static void main(String[] args) {
		int arr[] = { 8, 2, 5, 4, 0,55,88 };
		int arr2[] = { 7, 2, 5,7, 3, 5 ,88,66,99,88};
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {

					hs.add(arr[i]);//hashset does not store duplicate numbers
					break; //it will not traverse the remaing array if he found duplicate
				}
			}
		}
//		for (int a : hs){
//			System.out.print(a );
//		}
		System.out.println(hs+"duplicate number");
		
		/*
		 * Using HashSet metho
		 */
		HashSet<Integer> hs1=new HashSet<Integer>();
		for(int no:arr){
			hs1.add(no);
		}
		
		HashSet<Integer> hs2=new HashSet<Integer>();
		for(int no:arr){
			hs2.add(no);
		}
		
		for(int no:hs2){
			boolean b=hs1.add(no);//this method returns boolean value
			if(b==false){
				System.out.println(no);
			}
		}
	}

}
