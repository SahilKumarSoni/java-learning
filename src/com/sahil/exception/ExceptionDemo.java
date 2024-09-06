package exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 100;
		int num2 = 10;
		int result = 0;
		int arr[] = {10,20,30,40};
		
		try
		{
			result = num1/num2;
			System.out.println(arr[10]);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Recheck the values......." +" " + obj);
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Stay on your limits."+ " " + obj);
		}
		catch(Exception obj)
		{
			System.out.println("Somthing went wrong.........");
		}
		System.out.println("Result: " + result);
		System.out.println("Program Ending...");
	}

}
