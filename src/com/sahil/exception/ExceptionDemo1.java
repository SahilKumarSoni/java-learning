package exception;
import java.util.Scanner;
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Run?");
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		try
		{
			System.out.print("Enter an integer number: ");
			num = sc.nextInt();
		}
		catch(Exception obj)
		{
			System.out.println("Enter integer number only...");
		}
		finally
		{
			sc.close();
		}
		
		System.out.println("Number: " + num);
		 
		
	}

}
