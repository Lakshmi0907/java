class A{
// private int num=10;
private int sum(int a)
{
  return a;
}
int aver(int n, int n1)
{
  int num1=sum(n1);
  return num1/n;
}
}
public class privatemethod {
  public static void main(String[] args) {
    A obj=new A();
    int b=obj.aver(1,1);
    System.out.println(b);
  }
  
}
