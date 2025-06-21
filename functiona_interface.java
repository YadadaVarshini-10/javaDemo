
@FunctionalInterface
interface A {

  void show();

}
public class functiona_interface{

  public static void main(String[] args) {

    A obj=new A() {
    public void show(){

         System.out.println("m1 method: ");
    }
    };
    obj.show(); 
  }
}