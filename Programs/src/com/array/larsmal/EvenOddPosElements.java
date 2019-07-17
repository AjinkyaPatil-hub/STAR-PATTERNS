package com.array.larsmal;

class EvenOddPosElement {
	int sum=0,count=0;;
	
	public void evenPosNumm(int arr[]) {
		for(int i=1;i<arr.length;i=i+2){
			count++;
			sum=sum+arr[i];
			System.out.print("even pos: "+arr[i]+" ");
		}
		//System.out.println("total even:"count+ " " +"total sum of even:"+sum);
	}
	
	public void OddPosNumm(int arr[]) {
		System.out.println("\n");
		for(int i=0;i<arr.length;i=i+2){
			System.out.print("odd pos:"+arr[i]+" ");
		}
	
	}
}

public class EvenOddPosElements extends EvenOddPosElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		EvenOddPosElements ev = new EvenOddPosElements();
		ev.evenPosNumm(arr);
		 ev.OddPosNumm(arr);
	}

}
