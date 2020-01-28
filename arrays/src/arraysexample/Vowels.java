package arraysexample;
import java.util.Scanner;
public class Vowels 
{
	public static void main(String args[])
	{
		String s;int  count=0;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				count++;
			}
			
		}
		System.out.println(" number of vowels are:"+count);
	}
	
}
