package com.GreatLearningLab2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of Transaction Array");
         int size= sc.nextInt();
         int[] transactions=new int[size];
         System.out.println("Enter the values of the Transaction");
      		   for(int i=0;i<size;i++) {
      			   transactions[i]=sc.nextInt();
      		   }
      		   System.out.println("Enter the number of targets to be achieved");
      		   int targetSize= sc.nextInt();
      		   for(int i=0;i<targetSize;i++) {
      			   System.out.println("Enter target value");
      			   int target=sc.nextInt();
      			   int res= transaction.targetcheck(transactions,target);
      			   if(res>=0) {
      				   System.out.println("Target can be achieved after " + (int)(res+1)  +  " transactions");
      			   }else {
      				   System.out.println("Target cannot be achieved with given transactions");
      			   }
      		   }
      		   sc.close();
	}


	}


