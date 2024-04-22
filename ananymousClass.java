//this is the concept of ananymous inner classes if we want to ovverride a method only once instead of creating an inner class we can simply use ananymous inner class
// like the below code 
 class Demo2
{
void display()
{
  System.out.println("demo2 class method");
}
}
public class ananymousClass {
  public static void main(String[] args) {
    Demo2 d2=new Demo2(){
      public void display()
      {
        System.out.println("new method ");
      }
  };
  d2.display();
}
}

