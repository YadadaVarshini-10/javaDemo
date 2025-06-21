class A{

  int i=10;
  int j=20;
  A(int i,int j){

    System.out.println(i+ " "+j);
    System.out.println(this.i+" "+this.j);
  }
}

public class thissss {

  public static void main(String[] args){

    A a=new A(20, 30);


  }
  
}
