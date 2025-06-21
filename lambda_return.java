

interface a{

 int m1(int a ,int b);
}

public class lambda_return {

  public static void main(String[] args) {

    a obj=(int a,int b) ->

      {
        return a+b;
      };

    
    int result=obj.m1(10, 20);
    System.out.println(result);

  }
  
}
