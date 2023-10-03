package com.GreatLearningLab2;

public class transaction {
	public static int targetcheck(int[] transactions,int target)
	 {
		 int sum=0;
		 for(int i=0;i<transactions.length;i++) {
			 sum+=transactions[i];
			 if(sum>=target) {
				 return i;
				 
			 }
		 }
		 return -1;
	 

	}
	
}
