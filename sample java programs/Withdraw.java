public class Nestedif
{
public static void main(String[] args)
{
double amount=100;
double withdrawrate;
if(amount <=100)
withdrawRate=10;
}
else if(amount<=500)
{
withdrawRate=5;
}
else if(amount<=1000)
{
withdrawRate=2;
}
else
{
withdrawRate=1;
}
System.out.println("withdrawrate="+withdrawRate);
}
}