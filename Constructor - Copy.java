class Student{

  String name;
  int age;
  int marks;

  Student(String name,int age,int marks){

    this.name=name;
    this.age=age;
    this.marks=marks;
  }
  public void show(){

    System.out.println(name+"  : "+age+" : "+marks);
  }
}


public class Constructor {

  public static void main(String[] args) {
    Student s=new Student("varsha", 67, 364);
    s.show();
    

  }
  
}
