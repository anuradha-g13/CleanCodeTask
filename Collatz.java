package com.java.tasks;

public class Collatz {

	public int evenNumber(int no)
	{
		no=no/2;
		return no;
	}
	public int oddNumber(int no)
	{
		no=3*no+1;
		return no;
	}
	public void printCollatz(int no)
	{
		 System.out.print(no+" ");
		 while(no!=1)
		 {
			 if(no%2==0)
			 {
				 no=evenNumber(no);
			 }else {
				 no=oddNumber(no);
			 }
			 System.out.print(no+" ");
			
		 }
	}

	 public static void main(String arg[])
	 {
		 Collatz collatz= new Collatz();
		 collatz.printCollatz(Integer.parseInt(arg[0]));
		 
	 }
}
