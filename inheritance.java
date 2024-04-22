//this is inheritance concept here checkung which constrctor called first after creating the child
// class object here the parent class constructor calls first
// after that only child class calls
class A1{
  int a;
  public A1()
  {
  System.out.println("a constructor called");
}
}
class B extends A1{
  int b;
  public B(){
    System.out.println("B called");
  }
}
public class inheritance {
  public static void main(String[] args) {
    B b1=new B();

  }
}
