package org.cap.model;

public class Calculation {
	
	public void findSum(int[] arr) {
		int sum=0;
		for(int n:arr)
			sum+=n;
		
		System.out.println("Summation:" + sum);
	}
	
	
	public void divide(int num1,int num2) {
		System.out.println("Divide Numbers");
		System.out.println((float)num1/num2);
	}

	public void multiply(int[] arr) {
		int prod=1;
		for(int n:arr)
			prod*=n;
		
		System.out.println("Mulipication Value:" + prod);
	}

	
	
	
	
	
}
