class Overload
{
void demo(int a)
{
System.out.println("a:" +a);
}
void demo(int a,int b)
{
System.out.println("a and b: "+ a +"," +b);
}
double demo(double a){
System.out.println("double a: " +a);
return a*a;
}
}
class MethodOverloading
{
public static void main(String args[])
{
Overload obj=new Overload();
double result;
obj.demo(100);
obj.demo(100,200);
result=obj.demo(50.50);
System.out.println("o/p:" + result);
}
}