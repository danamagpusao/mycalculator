/**
 * Author: Kristine Elaine P. Bautista
 * Program Description: Calculator of Simple Mathematical Functions
**/

import java.util.Arrays;
import java.util.HashMap;
public class MyCalculator {
	// add two numbers
	public float add(float a,float b){
		return a+b;
	}
	
	// subtract two numbers
	public float subtract(float a,float b){
		return a-b;
	}
	
	// multiply two numbers
	public float multiply(float a,float b){
		return a*b;
	}
	
	// divide two numbers
	public float divide(float a,float b){
		return a/b;
	}
	
	// x^2 of two numbers
	public float square(int x){
		return x*x;
	}
	
	// x^3 of three numbers
	public float cube(int x){
		return x*x*x;
	}
	
	// n! of an integer
	public int nfactorial(int n){
		int factorial = 1;
		
		for(int i=1;i<=n;i++)
			factorial *= i;
		
		return factorial;
	}
	
	// binary search in an array
	int binarySearch(int[] a,int x){//1
		//checks if sorted
		for(int i = 0; i < a.length-1; i++){ //2
			if(a[i]>a[i+1]){ //3
				return -1;
			}
		}
			
		int n = a.length; // get number of elements in the array
		int lower, upper, middle; // variables for positions in the array
		lower = 0; upper = n-1; // initialize values of lower and upper points
		
		while(lower<=upper){//4
			middle = (lower+upper)/2;
			if(x>a[middle]) lower = middle + 1;//5
			else if(x<a[middle]) upper = middle - 1;//6
			else return middle;//7
		}
		
		return -1;//8
	}
	
}
