public class outerClasses {
  int a=10;
  public void display1()
  {
    System.out.println(inner.b);
  }
  innerClass inner=new innerClass();
  class innerClass
  {
    int b=10;
    public void display()
    {
      System.out.println("inner class"+a+b);
    }
  }
  public static void main(String[] args) {
    outerClasses outer=new outerClasses();
    outer.display1();
    outerClasses.innerClass inner= outer.new innerClass();
    inner.display();;
  }
}
