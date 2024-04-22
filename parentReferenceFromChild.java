

class D{
D()
{
  System.out.println("D class");
}
}
class D1 extends D{
D1()
{
  System.out.println("D1 class");
}
}
public class parentReferenceFromChild {
  public static void main(String[] args) {
    D d=new D();
  }
}
