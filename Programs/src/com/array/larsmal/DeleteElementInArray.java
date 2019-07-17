/*
 * 
	1>to delete an element from the array 
 * 		step 1 we would first find the number that is to be deleted
 * 		step 2 then we would match that element
 * 		step 3 after matching we would again traverse the array from found nuber and swap the element to legt side
 * 		Key point in this we must traverse the array till leng-1 and for printing also
 */


package com.array.larsmal;

public class DeleteElementInArray {

	public void deleteElement(int element,int arr[]){
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==element){
				for(int j=i;j<arr.length-1;j++){
					arr[j]=arr[j+1];
				}
				
				
			}
		}
		
		
	}
}
