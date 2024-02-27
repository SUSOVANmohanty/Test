interface Bank
{
public abstract int roi();
}
class SBI implements Bank
{
  public int roi()
  {
  return 5;
  }
}
class PNB implements Bank
{
  public int roi()
  {
  return 2;
  }
}
class Consumer
{
public static void main(String args[])
{
  SBI s=new SBI();
  System.out.println(s.roi());
  PNB p=new PNB();
  System.out.println(p.roi());
}
}
