package com.array.larsmal;


public class Main {
	public static void main(String[] args) {
		//main array
		int arr[]={5,8,3,2,6,2};
		
		//to print array
		for(int sL:arr){
			System.out.print(sL +" ");
		}System.out.println(" ");
	
		
		
//		// sort the array wrong code
//			SortTheArray sort=new SortTheArray();
//			sort.sort(arr);
//			System.out.print("Sorted array:");
//			for(int so:arr)
//				System.out.print(" "+so);
		
//		
		FirstDuplicateNumber fd=new FirstDuplicateNumber();
		fd.firstDuplicate(arr);
		
		
		
		
		
		
		
		/**
		//to print smallest and largest element in array
		LargestAndSmallest largeSmall=new LargestAndSmallest();
		largeSmall.larSmall(arr);
		
		//to print second largest number
		SecondLargest sl=new SecondLargest();
		sl.secondLargest(arr);
		
		//to print second smallest number
		SecondSmallest sm=new SecondSmallest();
		sm.seconSmallest(arr);
		
		//to print index of largest number and smallest number
		IndexOfLargestNum index=new IndexOfLargestNum();
		index.indexOfLargeNum(arr);
		index.indexOfSmallestNum(arr);
		
		//to delete array element in array/pass the arr and the element that you want to delete
//		DeleteElementInArray delete=new DeleteElementInArray();
//		delete.deleteElement(4, arr);
//		System.out.println("after deleting element in array:");
//		// as we have swaped the element so arr size is shrinked so len-1
//		for(int d=0;d<arr.length-1;d++){
//			System.out.print(" "+arr[d]);
//		}
		
		//to delete duplicate element in array in sorted array way
//		DupicateRemoveInArray dup=new DupicateRemoveInArray();
//		 dup.dupicate(arr);
//		 
		 sort the array
		SortTheArray sort=new SortTheArray();
		sort.sort(arr);
		System.out.print("Sorted array:");
		for(int so:arr)
			System.out.print(" "+so);
		
		//duplicate removed from using HashSet
		DuplicateUsingHashSet dh=new DuplicateUsingHashSet();
		dh.duplicateHashSet(arr);
*/
	}

}
