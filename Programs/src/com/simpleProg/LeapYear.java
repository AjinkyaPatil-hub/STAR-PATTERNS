/*
 * 	condition for leap year
 * 1>if it gets divided with 400,4,No leap year
 * 		if it gets divided by 100 it is leap year
 * 		otherwise leap year
 * 
 */



package com.simpleProg;

public class LeapYear {

	public static void main(String[] args) {
		int year=2044; 
		int num;
		
		//swap using  two num without 3
		int temp,a=5,b=6;
		a=a+b;
		b=a-b;
		a=a-b;
			System.out.println(a+""+b);
		//2 table
			
			for(int i=1;i<=5;i++){
				
				
				System.out.print("2"+"*"+i+"="+2*i+" ");
			}
			
			System.out.println();
		
		if((year%4==0) ||(year%400==0 && year%400==0)){
			System.out.println("leap year");
		}else
			System.out.println("not leap year");
		
		if(year%4==0)
		{
			if(year%100==0){
				if(year%400==0){
					System.out.println("Leap year");
				}else
					System.out.println("not leap year");
			}else
				System.out.println("leap year");
		}else
			System.out.println("not leap year");
		
		
	}

}
