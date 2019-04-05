package org.cap.model;

public class Calculation {
	
	public void findSum(int[] arr) {
		int sum=0;
		for(int n:arr)
			sum+=n;
		
		System.out.println("Summation:" + sum);
	}

	public void multiply(int[] arr) {
		int prod=1;
		for(int n:arr)
			prod*=n;
		
		System.out.println("Mulipication Value:" + prod);
	}

	
	
	
	
	
}
