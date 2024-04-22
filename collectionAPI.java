class A{
public void display()
{
  System.out.println("display");
}
}
 class collectionAPI1 extends A{
  int a=10;
  public void display1()

{
  System.out.println("display1");
}
}
public class collectionAPI{
  public static void main(String[] args) {
    A a=new collectionAPI1();
    
  }
}
