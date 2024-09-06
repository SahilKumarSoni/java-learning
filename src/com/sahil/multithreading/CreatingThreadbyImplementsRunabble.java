package com.skd.multithreading;

import java.util.Scanner;

class Calculate1 implements Runnable 
{
	public void run()
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
	
	
	
}
class Massage1 implements Runnable 
{
	public void run()
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

public class CreatingThreadbyImplementsRunabble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MAIN.");
		
		Calculate1 c = new Calculate1();
		Massage1 m = new Massage1();
		Thread th1 = new Thread(c);
		Thread th2 = new Thread(m);
		
		th1.start();
		th2.start();

	}

}
