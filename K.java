abstract class K
{
  public abstract int wheel();
}
class L extends K
{  
  public int wheel()
  {
    return 4;
  }
}
class H extends K
{
  public int wheel()
  {
   return 2;
  }
}
class D
{
  public static void main(String args[])
  {
  L l=new L();
  System.out.println(l.wheel());
  H h=new H();
  System.out.println(h.wheel());
  }
}