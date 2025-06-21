public class Try_with_multiple_catch {

  public static void main(String[] args) {

    int i=2;
    int j=0;

    int a[]=new int[5];
    String str="null";

    try
    {
      j=18/i;
      System.out.println(a[5]);
      System.out.println(str.length());
    }

    catch(ArrayIndexOutOfBoundsException e){

      System.out.println("Out of bonds...");
    }
    catch(ArithmeticException e){

      System.out.println("cannot divide by zero...");
    }
    catch(Exception e){

      System.out.println("Something went wrong...."+e);

    }

    System.out.println("bye");
    
   

    
  }
  
}
