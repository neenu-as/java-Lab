class Demo
{
void Multiply(int a,int b)
{
System.out.println("Result is:"+(a*b));
}
void Multiply(int a, int b,int c)
{
System.out.println("Result is:"+(a*b*c));
}
public static void main(String[]args)
{
Demo obj=new Demo();
obj.Multiply(8,5);
obj.Multiply(4,6,2);
}
}

