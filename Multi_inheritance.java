class parent{

  int age;
  String name;

  parent(String name,int age){

    this.age=age;
    this.name=name;
  }

  void details(){

    System.out.print(name+" : "+age);
  }
}

class child extends parent{

  int age;
  String name;
  String addr;
  int sal;

  child(String name,int age,String addr,int sal){

    super(name,age);
    this.addr=addr;
    this.sal=sal;
  }

  void ch_details(){

    super.details();

    System.out.print(" : "+addr+" : "+sal);
  }
}

class gc extends child{

  String surname;

  gc(String name,int age,String addr,int sal,String surname){

    super(name,age,addr,sal);
    this.surname=surname;
  }

  void all_details(){

    super.ch_details();
    System.out.print(" : "+surname);
  }
}




public class Multi_inheritance {

  public static void main(String[] args) {

    gc c=new gc("varsha", 37, "chinnthalathota", 40000, "yadada");
    c.all_details();
    
  }
  
}
