package com.all.starPatterns;

/*
 * 	   * 
 * 	   * *
 *     * * *
 *     * * * *
 */

public class StarPatern {
	
	public static void main(String[] args) {
		//this for is used for rows
		for(int i=1;i<=4;i++)
		{
			//this for is used for columns
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");

		}
		
		System.out.println(" \n");
		
		/*			i(rows)     j(columns)
		 *   ****	1 			4
		 *   ***	2			3	
		 *   ** 	3			2
		 *   *		4			1
		 */
	
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print("*");
			 }
			System.out.println(" ");
		}
	
	
	}
}

