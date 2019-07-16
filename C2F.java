package com.java.tasks;

public class C2F {

	public static void main(String arg[])
	{
	
		convert(Integer.parseInt(arg[0]),Integer.parseInt(arg[1]));
		
	}
	public static void convert(int measureType,int degree)
	{
		if(measureType==0)
		{
			degree=CToF(degree);
			System.out.print(degree+" degree Fehrenheit");
		}else {
			degree=FToC(degree);
			System.out.print(degree+" degree celsius");
		}
	}
	public static int CToF(int degree)
	{
		degree=degree*9/5 +32;
		
		return degree;
	}
	public static int FToC(int degree)
	{
		degree=(degree-32)*5/9;
		return degree;
	}
}
