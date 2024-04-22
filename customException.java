class customExcep extends Exception{
  public customExcep(String s)
  {
    super(s);
  }
}

public class customException{

  public static void main(String[] args) {

    int i=10;
    int j=20;
    try{
      int k=i/j;
      if(k==0)
      {
        throw new customExcep("custom exception");
      }
    }
    catch(customExcep e)
    {
      System.out.println("cusotm exeptio catch block"+ " "+ e);
    }
    
  }
}
