abstract class P
{
  public abstract void m1();
  public abstract void m2();   
}
class C extends P
{
  public void m1()
  {
  System.out.println("m1");
  } 
}
class SC extends P
{
  public void m2()
  {
  System.out.println("m2");
  }
} 
class D 
{
  public static void main(String args[])
  {
  C c=new C();
  System.out.println(c.m1());
  SC sc=new SC();
  System.out.println(sc.m2());
  }
}