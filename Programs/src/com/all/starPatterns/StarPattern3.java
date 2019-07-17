/**
 * 	---*
 * 	--**
 * 	-***
 * 	****	
 */
package com.all.starPatterns;

public class StarPattern3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");// this is for print in straight line
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*"); //print is used to print * in straight line
			}
			System.out.println("");//println is used to print on nxt line
		}


	}
}
