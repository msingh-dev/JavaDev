package com.pattern.problems;

public class PatternProblems {

	public static void main(String[] args) {

	//	squarePattern(5);
	//	increasingPattern(5);
	//	increasingPatternNumber(5);
	//	rightTrianglePatternNumber(5);

	}

	/***
	 * 
	 * @param number
	 * 
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
	
	/***
	 * 
	 * @param number
	 */
	private static void increasingPattern(int number) {
		System.out.println("Entering method increasingPattern");
		
		for(int i = 0 ; i < number ; i++) {
			for(int j = 0; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Exiting method increasingPattern");
	}
	
	/***
	 * 
	 * @param number
	 */
	private static void increasingPatternNumber(int number) {
		System.out.println("Entering method increasingPatternNumber");
		
		for(int i = 0 ; i < number ; i++) {
			for(int j = 0; j <=i ; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		
		System.out.println("Exiting method increasingPatternNumber");
	}
	
	/***
	 * 
	 * @param number
	 */
	private static void rightTrianglePatternNumber(int number) {
		System.out.println("Entering method rightTrianglePatternNumber");
		
		for(int i = 0 ; i < number ; i++) {
			int num = 1;
			for(int j = 0; j <=i ; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}	
		System.out.println("Exiting method rightTrianglePatternNumber");
	}
	
	
}
