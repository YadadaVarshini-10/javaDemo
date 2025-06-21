class Met{

  public void show(){

    System.out.println("hi");
  }

  public int add(int a,int b){

    return a+b;
  }

  public String name(String name){

    return name;
  }
}

public class Methods {

  public static void main(String[] args) {

    Met m=new Met();
    m.show();
    int res=m.add(2, 3);
    System.out.println(res);
    String na= m.name("varsha");
    System.out.println(na);
    
  }
  
}
