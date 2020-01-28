package exception;
import java.util.Scanner;
public class Field 
{
	public static void main(String args[])
	{
		int a;
		String n;
		try
		{
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
			n=s.nextLine();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println("Entered field is incorrect");
		}
		
	}
}
