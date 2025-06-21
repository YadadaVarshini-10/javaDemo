class parent{

  String name;
  int age;

  parent(String name,int age){

    this.name=name;
    this.age=age;
  }

  void details(){

    System.out.print(name+" : "+age);
  }
}

class child extends parent{

  String addr;

  child(String name,int age,String addr){

    super(name,age);
    this.addr=addr;
  }

  void s_details(){

    super.details();
    System.out.print(" : "+addr);
  }
}

class gc extends child{

  int sal;
  gc(String name,int age,String addr,int sal){

    super(name,age,addr);
    this.sal=sal;
  }

  void all_details(){

    super.s_details();
    System.out.print(" : "+sal);
  }
}

public class hierachical {

  public static void main(String[] args) {

    gc c=new gc("varsh", 45, "chithala", 50000);
    child d=new child("hari", 35, "thota");
    c.all_details();
    d.s_details();
    
  }
  
}
