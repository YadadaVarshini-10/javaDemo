class Student{

  String name;
  int age;
  int marks;
  static String cname;

  Student(String name,int age,int marks){

    this.name=name;
    this.age=age;
    this.marks=marks;


  }

  static void cname(String cname){

    Student.cname=cname;
  }


  public void std_details(){

    System.out.println(name+" : "+age+" : "+marks+ " : "+cname);
  }




}
public class Static_method{

  public static void main(String[] args) {
    
    Student s=new Student("varsha",45,456);
    Student s1=new Student("harini",56,134);
    Student.cname="sri vasavi";
    s1.cname="srkr";
    s.std_details();
    s1.std_details();

    
  }
}