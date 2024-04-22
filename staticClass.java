 class Demo1 {
   static int b=10;
   static class inner1{
    public void display()
    {
      System.out.println("inner class");
    }
   }
}

public class staticClass
{
  public static void main(String[] args) {
    Demo1.inner1 i1=new Demo1.inner1();
    i1.display();
  }
}
