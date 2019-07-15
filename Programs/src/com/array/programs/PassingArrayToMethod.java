package com.array.programs;

	class Demo{
		
		public static void acceptArray(Object a[]){
			int len=a.length;
			
			for(int i=0;i<len;i++){
				System.out.println(a[i]);
			}
		}
		
	}




public class PassingArrayToMethod {

	public static void main(String[] args) {
		Short a[] ={5,9,3};
		Demo.acceptArray(a);
	}

}
