public class Throww {

  public static void main(String[] args) {

    int i=0;
    int j=0;

  
    try
    {
      j=18/i;
      if(j==0)
      throw new ArithmeticException();  //call the catch whether not called
    }
    catch(ArithmeticException  e){

       j=18/1;
       System.out.print("thats defult output.."+ e);
    }
    catch(Exception e)
    {

      System.out.println("Something went wrong..");
    }

    System.out.println(j);
    System.out.println("bye");

    
  }
  
}
