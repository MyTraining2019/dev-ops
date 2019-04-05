package org.cap.boot;

import org.cap.model.Calculation;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Calculation Project....");
		
		int[] arr= {1,2,3,4,4,5,5,67};
		Calculation obj=new Calculation();
		obj.findSum(arr);
		//obj.findSum();
	}

}
