class Polymorphism
{
public void add(char c,int b)
{
System.out.println(c +" " +b);
}
public void add(char c)
{
System.out.println(c);
}
}
public class overload{
public static void main(String[] args)
{
Polymorphism obj=new Polymorphism();
obj.add('a');
obj.add('a',10);
}
}
