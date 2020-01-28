package sampleinheritance;

public class car extends machine
{	
	public void start()
	{
		System.out.println("The car has started");
	}
	public void stop()
	{
		System.out.println("The car has stopped");
	}
	public void wipewindshield()
	{
		System.out.println("check the machine");
	}
	public void showinfo()
	{
		System.out.println("Display the details");
		System.out.println( nameplate);
	}
}
