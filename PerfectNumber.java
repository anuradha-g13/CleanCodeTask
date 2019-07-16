package com.java.tasks;

public class PerfectNumber {

	public static void main(String []arg)
	{
		int no=Integer.parseInt(arg[0]);
		PerfectNumber obj=new PerfectNumber();
		if(obj.isPerfectNumber(no))
		{
			System.out.format(no+" is a Perfect Number");
		}else {
			System.out.format(no+" is NOT a Perfect Number");
		}
		
	}
	public boolean isPerfectNumber(int checkNo)
	{
		int divisor, sum = 0 ;
		for(divisor = 1 ; divisor < checkNo ; divisor++) {
			if( checkNo % divisor == 0)  {
				sum = sum + divisor;
			}
		}
		if (sum == checkNo) {
			return true;
		}
		else {
			return false;
		}
	}
}
