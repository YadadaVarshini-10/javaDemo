@FunctionalInterface

// interface A{

//   void m1();
// }

// public class Lambda {

//   public static void main(String[] args) {

//     A obj =() ->System.out.println("m1 method:");
//     obj.m1(); 
//   }
// }

interface A{

  void m1(int a);
}

public class Lambda{

  public static void main(String[] args) {
    
    A obj= i -> System.out.println("m1 methof");
    obj.m1(4);

  }
}
