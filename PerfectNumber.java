package Mypack;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
		

	}

}
