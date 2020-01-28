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
public class addoverload{
public static void main(String[] args)
{
addoverload obj=new addoverload();
obj.add('a');
obj.add('a',10);
}
}
