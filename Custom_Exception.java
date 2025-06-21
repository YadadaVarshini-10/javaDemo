///throw my exception we use Custom _ exception  Arthimetic expression there is throw 
class myException extends Exception{

  public myException(String string)
  {

    super(string);
  }
}

public class Custom_Exception {

  public static void main(String[] args) {
    
    int i=20;
    int j=0;

    try{

      j=18/i;
      if(j==0)
      throw new myException(" i dont want");
    }
    catch(myException e)
    {
      j=18/1;
      System.out.println("thats the default output"+e);
    }
    catch(Exception e)
    {
      System.out.println("something went wrong"+e);
    }
    System.out.println(j);

  }
  
}
