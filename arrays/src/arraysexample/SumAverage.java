package arraysexample;
import java.util.Scanner;
public class SumAverage 
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		int arr[]={1,2,3,4,5},sum=0,avg=0;
		for(int i=0;i<5;i++)
		{
			sum=arr[i]+sum;
		}
		System.out.println("sum of elements is:"+sum);
		avg=sum/5;
		System.out.println("Average of elements is:"+avg);
	}
}
