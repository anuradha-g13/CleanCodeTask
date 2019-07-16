package com.java.tasks;

public class FizzBuzz {
	
	public boolean isDivisibleBy3(int no)
	{
		if(no%3==0)
			return true;
		
		return false;
		
	}
	public boolean isDivisibleBy5(int no)
	{
		if(no%5==0)
			return true;
		
		return false;
		
	}
	
	public void printFizzBuzz()
	{
		for(int no=1;no<=100;no++)
		{
			if(!isDivisibleBy3(no) && !isDivisibleBy5(no))
				System.out.print(no);
			
			if(isDivisibleBy3(no))
				System.out.print("Fizz");
			
			if(isDivisibleBy5(no))
				System.out.print("Buzz");
			
			System.out.print(" ");
		}
	}
	

	public static void main(String [] arg)
	{
		FizzBuzz obj=new FizzBuzz();
		obj.printFizzBuzz();
	}
}
