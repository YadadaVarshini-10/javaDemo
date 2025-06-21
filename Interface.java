 interface Inn {

  void m1();
  void m2();
}

class adap implements Inn{

  public void m1(){

    System.out.println(" m1 method");
  }

  public void m2(){

    System.out.println("m2 method");
  }
}

public class Interface {
  public static void main(String[] args) {

    adap a=new adap();
    a.m1();

  }
}
