package CTSDemo;
import java.util.Scanner;
public class Dividebyzero {
public static void main(String[] args) {
	/*int a,b;
	a=10;
	b=0;
		try {
		int fraction=a/b;
	System.out.println("This line will not be Executed");

}
	catch(ArithmeticException e)
	{
		System.out.println("In the catch Block due to Exception="+e);
	}
		System.out.println("End Of Main");
}
}*/
	/*try {
		int a=20;
		int b=0  ;
		int fraction=a/b;
		System.out.println("This line will not be Executed");
	}
	catch(ArithmeticException e)
	{
		System.out.println("In the catch block due to exception="+e);
		
	}
	finally {
		System.out.println("Inside the finally block");
	}
	}
}*/
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a;
	try {
	 a=sc.nextInt();
		
	}
	catch(Exception e)
	{
		System.out.println("Invalid number");
		a=0;
	}
	System.out.println("Value of a: "+a);
	sc.close();
}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	