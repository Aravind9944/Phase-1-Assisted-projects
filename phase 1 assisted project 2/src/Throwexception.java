
class Test
{
  static void avg()
  {
    try
    {
      throw new ArithmeticException("memo");
    }
    catch(ArithmeticException e)
    {
      System.out.println("Exception caught");
    }
 }

 public static void main(String args[])
 {
    avg();
 }
}