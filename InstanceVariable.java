class InstanceVariable1 {
   int a;
    static int b;
    // void sum(int a, int b)
    // {
    //   System.out.println(a+b);
    // }
    void sum()
    {

      System.out.println("value of a is" +a);
      System.out.println("values of b"+b);
      a=a+1;
      b=b+1;
    }

  }
public class InstanceVariable{
    public static void main(String[]args)
    {
InstanceVariable1 object1=new InstanceVariable1();
object1.a=1;
InstanceVariable1.b=1;
object1.sum();
InstanceVariable1 object2=new InstanceVariable1();
object2.a=1;
InstanceVariable1.b+=1;
object2.sum();
// object1.sum(object1.a,object1.b);
    }
}