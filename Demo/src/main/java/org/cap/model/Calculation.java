package org.cap.model;

public class Calculation {
	
	
	public void findSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		
		System.out.println("Summation:" + sum);
	}

	public void multiply(int[] arr) {
		int prod=1;
		for(int n:arr)
			prod*=n;
		
		System.out.println("Mulipication Value:" + prod);
	}

	
	
	
	
	
}
