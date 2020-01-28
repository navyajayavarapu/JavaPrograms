class DisplayOverloading
{
public void add(char c)
{
System.out.println(c);
}
public void add(char c,int num)
{
System.out.println(c +" "+num);
}
}
public class ExampleOverloading
{
public static void main(String[] args)
{
DisplayOverloading obj=new DisplayOverloading();
obj.add('a');
obj.add('a',10);
}
}
