public class Persondetails
{
  String name;
		int age;
		Persondetails() //Default constructor
		{
			this.age=21;
			this.name="Rita";
		}
			Persondetails(String n,int a) //parameterized constructor

	{
		this.age=a;
		this.name=n;
	}
			public static void main(String[] args)
			{
				Persondetails obj1=new Persondetails();
				Persondetails obj2=new Persondetails("Rita",21);
				System.out.println(obj1.name+" "+obj1.age);
				System.out.println(obj2.name+" "+obj2.age);
				
			}

}