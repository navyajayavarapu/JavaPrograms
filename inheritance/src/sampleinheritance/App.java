package sampleinheritance;

public class App 
{
	public static void main(String args[])
	{
		car obj1=new car();
		obj1.start();
		obj1.wipewindshield();
		obj1.showinfo();
		obj1.stop();
		machine obj=new machine();
		obj.start();
		obj.stop();
	}
	
}
