package intrfaces;
import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist 
{
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>();		//list1
		list1.add("Navya");
		list1.add("Srikanth");
		list1.add("Satyanarayana");
		list1.add("Angelica");
		list1.add("Anna");
		list1.add("Sharon");
		ArrayList<String> list2= new ArrayList<>();	//list2
		list2.add("Yamini");
		list1.addAll(list2);
		System.out.println(list1);
	}
}
