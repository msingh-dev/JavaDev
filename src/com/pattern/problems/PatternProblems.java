package com.pattern.problems;

public class PatternProblems {

	public static void main(String[] args) {

		squarePattern(5);

	}

	/***
	 * 
	 * @param number
	 */
	private static void squarePattern(int number) {
		System.out.println("Entering method squarePattern");

		int a = 1;
		for(int i = 0 ; i < number ; i++) {
			for(int j = 0; j < number ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Exiting method squarePattern");
	}
	
	private static void increasingPattern(int number) {
		System.out.println("Entering method increasingPattern");
		int tmp = 0;
		
		for(int i = 0 ; i < number; i++) {
			while(tmp == number) {
				System.out.println();
			}
		}
		
		System.out.println("Exiting method increasingPattern");
	}
}
