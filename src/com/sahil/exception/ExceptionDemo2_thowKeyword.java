package exception;

class MyException extends Exception
{
	public MyException()
	{
		
	}
	public MyException(String msg)
	{
		super(msg);
	}
}
public class ExceptionDemo2_thowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = -10;
		
		try
		{
			if(num2 < 0)
			{
				Exception e = new MyException("-ve number");
				throw e;
			}
			int result = num1/num2;
			System.out.println("Result: " + result);
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}

}
