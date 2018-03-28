package javatest;

import java.util.Arrays;

public class Stack {
	
	private int[] arr = new int[5];
	private int stacktop = -1;
	
	public boolean push(int a) {
		
		if (stacktop<5) {
			stacktop++;
			arr[stacktop] = a;
			return true;
		}
		else {
			System.out.println("Stack overflow");
			return false;
		}
		
	}
	
	public int pop () {
		
		if(stacktop>0) {
			arr[stacktop] = 0;
			stacktop--;
			return arr[stacktop];
		}
		else {
			System.out.println("Stack underflow");
			return 0;
		}
	}
	
	public String show() {
		
		return("Stack Content:" + Arrays.toString(arr));
	}
	
}
