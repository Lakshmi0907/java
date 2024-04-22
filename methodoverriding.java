class water
{
void func1()
{
  System.out.println("fun1");
}
}
class food extends water{
void func2()
{
  System.out.println("food class fucntion");
}
}
class snacks extends food{

}
public class methodoverriding extends food{
  public static void main(String[] args) {
    snacks f1=new snacks();
    f1.func1();
  }
}
