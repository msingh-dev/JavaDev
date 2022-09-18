package com.dsa.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int[] rArr= reverseArr(arr);
		
		for(int i = 0 ; i < rArr.length; i++) {
			System.out.print(rArr[i] + " , ");
		}
		
		

	}
	
	/***
	 * 
	 * @param array
	 * @return
	 */
	public static int[] reverseArr(int[] array) {
		
		int[] revArr = new int[array.length];
		int n = array.length;
		
		for(int i = 0 ; i < array.length ; i++) {
			
			revArr[i] = array[n-1];
			n = n-1;
		}
		
		return revArr;
		
	}

}
