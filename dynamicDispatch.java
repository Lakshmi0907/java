class Demo
{
  void display()
  {
    System.out.println("Demo class");
  }
}
class Demo1 extends Demo
{
  void display()
  {
    System.out.println("Demo1 class");
  }
}
class Demo2 extends Demo
{
  void display()
  {
    System.out.println("Demo2 class");
  }
}

public class dynamicDispatch {
  public static void main(String[] args) {
    Demo d=new Demo();
    d.display();
    d = new Demo1();
    d.display();
    d=new Demo2();
    d.display();


  }
  
}
