package org.cap.model;

public class Calculation {
	private int[] arr= {2,3,4,5,67,8};
	
	public void findSum() {
		int sum=0;
		System.out.println("Arrays changed in this method...");
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
