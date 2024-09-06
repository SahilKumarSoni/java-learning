package com.skd.multithreading;

 class  MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("MyThread.");
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
		System.out.println("**********************************");
	}
}

public class CreatingThreadbyExtendingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main."); 
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
		System.out.println("**********************************");
		MyThread1 th = new MyThread1(); 
		th.start();

	}

}
