class Student{

  static String college;
  String name;
  int agee;
  int marks;

  public void show(){

    System.out.println(name+" : "+agee+" : "+marks+" : "+college);
  }
}


public class Static_variables {

  public static void main(String[] args) {

    Student s=new Student();
    s.name="varsha";
    s.agee=26;
    s.marks=156;
    Student.college="vasavi";
    

    Student s1=new Student();
    s1.name="varsha";
    s1.agee=26;
    s1.marks=156;
    Student.college="vasavi";
    s.college="srkr";
  
    s1.show();
   
    s.show();

  }
  
}
