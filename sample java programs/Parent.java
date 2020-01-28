class Parent 
{
	 void methodOfParentClass()
	 {
		 System.out.println("Parent method");
	 }

}
class child extends Parent
{
	@Override
	void  methodOfParentClass()
	{
		 System.out.println("Child method");
	}
}
class MethodOverriding
{
	public static void main(String[] args)
	{
		Parent obj1=new Parent();
		obj1.methodOfParentClass();
		Parent obj2=new child();
		obj2.methodOfParentClass();
	}
}