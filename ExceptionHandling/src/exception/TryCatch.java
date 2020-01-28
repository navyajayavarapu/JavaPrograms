package exception;

public class TryCatch 
{
	public static void main(String args[])
	{
		try
		{
			int n[]=new int[10];
			System.out.println("Accessing the element"+n[12]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown" +e);
		
		System.out.println("Out of block");
		}
	}
}
