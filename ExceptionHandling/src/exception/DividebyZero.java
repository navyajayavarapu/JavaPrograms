package exception;

public class DividebyZero 
{
	public static void main(String args[])
	{
		int a=5,s;
		try
		{
			s=a/0;
			System.out.println(" value of s is:"+s);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arthmetic exception :" +e);
			//System.out.println("Out of block");
		}
		finally
		{
			System.out.println("Out of block");
		}
	}
}
