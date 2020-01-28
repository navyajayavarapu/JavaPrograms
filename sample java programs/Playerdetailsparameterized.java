//Write program using constructor display following cricket player details Accessing object data through reference
//Using parameterized constructor

public class Playerdetailsparameterized
	{
		String name;
		        String DOB;
                int age;
                int cen;
                int hcen;
                Playerdetailsparameterized(String n,String a,int b,int c,int d)

            	{
            		        this.name=n;
                                    this.DOB=a;
                                    this.age=b;
                                    this.cen=c; 
                                    this.hcen=d;

            	}
				public static void main(String[] args)
				{
					Playerdetailsparameterized obj1=new Playerdetailsparameterized("Dhoni",23-04-1970,38,100,50);
					
					System.out.println(obj1.name +"\n"+ obj1.DOB+"\n"+ obj1.age+"\n"+ obj1.cen+"\n"+ obj1.hcen);
					
					
			}	}