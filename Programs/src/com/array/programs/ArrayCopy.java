package com.array.programs;

 class ArrayCopy {
//we can overload main method
//	public static void  main(int a){
//		System.out.println(a);
//	}
	
	
	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 8, 9 };
		int len = arr1.length;
		int[] arr2 = arr1;

		for (int i = 0; i < len; i++) {
			arr1[i] = arr2[i];
		}
		System.out.println("first array");
		for (int nn : arr1){
				System.out.print(nn);
				
		}System.out.println( );
		System.out.println("copy array 2");
		for (int n : arr2)
			System.out.print(n);
		
	}

}
