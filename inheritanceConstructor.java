class cls1
{
  cls1(){
System.out.println("cls constructor called");
  }
  cls1(int b){
    System.out.println("b parametre cls1 called");
  }
}
class cls2 extends cls1
{
  cls2(){
    System.out.println("c2ls constructor called");
  }
  cls2(int a)
  {
    super(a);
    System.out.println("parameter");
  }
}
public class inheritanceConstructor {
  public static void main(String[] args) {
    cls2 a1=new cls2(1);

  }
}
