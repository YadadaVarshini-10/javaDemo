class parent{

  void m1(){

    System.out.println("m1 method");
  }

  void ex(int a){

    System.out.println("a b is metods");
  }
}

class son extends parent{

  void m1(){

    super.m1();
    System.out.println("m1 is method");
  }
  void ex(int a){

    System.out.println("ec");
  }
}

public class Super {
  public static void main(String[] args) {

    son s=new son();
    s.m1(); 
    s.ex(1);
  } 
}
