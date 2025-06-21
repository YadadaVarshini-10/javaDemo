class person{

  int age;
  String name;
  String addr;

  person(String name,int age,String addr){

    this.name=name;
    this.age=age;
    this.addr=addr;
  }

  void details(){

    System.out.print(name+" : "+age+" : "+addr);
  }

}

class employee extends person{

  int age;
  String name;
  String addr;
  int sal;

  employee(String name,int age,String addr,int sal){

    super(name,age,addr);
    this.sal=sal;
  }

  void std_details(){

    super.details();
    System.out.print(" : "+sal);
  }

}
public class inheritance {

    public static void main(String[] args) {

      employee e=new employee("varsha", 34, "chinthalathota", 10000);
      e.std_details();
      

    }
}
