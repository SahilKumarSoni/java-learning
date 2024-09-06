package com.skd.multithreading;

import java.util.Scanner;

class Mythread extends Thread
{
	public void run()
	{
		String tName = currentThread().getName();
		
		if (tName == "CALC")
			calc();
		else
			masg();
	
	}
	public void calc()
	{
		System.out.println("CALC.");

		Scanner scan = new Scanner(System.in);
		int num1,num2,result;
		
		System.out.println("Enter First Number: ");
		num1 = scan.nextInt();
		System.out.println("Enter Second Number: ");
		num2 = scan.nextInt();
		
		result = num1 + num2;
		System.out.println("Result: " + result);
	}
	
	public void masg()
	{
		try
		{
		System.out.println("MASSAGE.");

		for(int i = 0; i<5; i++)
		{
			System.out.println("Hello.");
			Thread.sleep(3000);
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Error.:(");
		}
	}
	
}

public class CreatingMultiThreadInSingleRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread thread1 = new Mythread();
		Mythread thread2 = new Mythread();
		
		thread1.setName("CALC");
		thread2.setName("MSG");
		
		thread1.start();
		thread2.start();		
	}
}
