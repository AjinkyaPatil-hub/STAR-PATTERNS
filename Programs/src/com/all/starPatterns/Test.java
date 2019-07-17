/**
 *	*
 *	
 */

package com.all.starPatterns;

public class Test {

	public static void main(String[] args) {
		int i, j;
		int n = 6;
		for (i = n; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}