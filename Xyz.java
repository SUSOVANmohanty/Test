interface Xyz
{
public abstract void m1();
public abstract void m2();
}
class Math implements Xyz
{
public void m1()
{
System.out.println("Hi");
}
}
public void m2()
{
System.out.println("Bye");
}
class Demo
{
public static void main(String args[])
{

Math m=new Math();
m.m1();
}
}



